package com.example.finalprojectmabna;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class logInPage extends AppCompatActivity {
            private EditText mEmail;
            private EditText mPassword;
            private ProgressBar mprogress_bar;
            private Button msighinBtn;
            private Button mRegister;
            private FirebaseAuth mAuth;
            private EditText mUsername;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_log_in_page);
                mAuth = FirebaseAuth.getInstance();

                mEmail = (EditText) findViewById(R.id.email_editText);
                mPassword = (EditText) findViewById(R.id.pass_editText);
                msighinBtn = (Button) findViewById(R.id.button2);
                mRegister = (Button) findViewById(R.id.Register);
                mprogress_bar = (ProgressBar) findViewById(R.id.progressBar222);
                mUsername = (EditText)  findViewById(R.id.Usernameedittext);



                msighinBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (isEmpty()) return;
                        inProgress(true);
                        mAuth.signInWithEmailAndPassword(mEmail.getText().toString(),
                                mPassword.getText().toString())
                                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                                    @Override
                                    public void onSuccess(AuthResult authResult) {
                                        String one =mEmail.getText().toString();
                                        String two =mUsername.getText().toString();
                                        Toast.makeText(logInPage.this, "تم تسجيل حسابك !", Toast.LENGTH_LONG).show();
                                        Intent intent = new Intent(logInPage.this, optionsActivity.class);
                                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                        intent.putExtra("o1",one);
                                        intent.putExtra("o2",two);
                                        startActivity(intent);
                                        finish();
                                      return;
                                    }
                                }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                inProgress(false);
                                Toast.makeText(logInPage.this, "خطأ في التسجيل", Toast.LENGTH_LONG).show();

                            }
                        });

                    }
                });

                mRegister.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (isEmpty()) return;
                        inProgress(true);
                        mAuth.createUserWithEmailAndPassword(mEmail.getText().toString(),
                                mPassword.getText().toString())
                                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                                    @Override
                                    public void onSuccess(AuthResult authResult) {
                                        Toast.makeText(logInPage.this, "تم إضافة الحساب , قم بالتسجيل!", Toast.LENGTH_LONG).show();
                                        inProgress(false);
                                    }
                                }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                inProgress(false);
                                Toast.makeText(logInPage.this, "خطأ في إضافة حساب جديد", Toast.LENGTH_LONG).show();
                            }
                        });
                    }
                });
            }


                private void inProgress( boolean x){
                    if (x) {
                        mprogress_bar.setVisibility(View.VISIBLE);
                        msighinBtn.setEnabled(false);
                        mRegister.setEnabled(false);
                    } else {
                        mprogress_bar.setVisibility(View.GONE);
                        msighinBtn.setEnabled(true);
                        mRegister.setEnabled(true);
                    }
                }

                private boolean isEmpty () {
                    if (TextUtils.isEmpty(mEmail.getText().toString())) {
                        mEmail.setError("REQUIRED");
                        return true;
                    }
                    if (TextUtils.isEmpty(mPassword.getText().toString())) {
                        mPassword.setError("REQUIRED");
                        return true;
                    }
                    return false;
               }

            }
