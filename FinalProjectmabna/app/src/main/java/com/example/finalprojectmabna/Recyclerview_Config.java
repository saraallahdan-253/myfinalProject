package com.example.finalprojectmabna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.List;

public class Recyclerview_Config {
    FirebaseAuth mAuth;
    private static FirebaseUser user;
    private Context mContext;
    private OfficesAdapter mOfficessAdapter;


    public void setConfig(RecyclerView recyclerView, Context context, List<Offices> officee, List<String> keys) {
        mAuth = FirebaseAuth.getInstance();
        user = mAuth.getCurrentUser();
        mContext = context;
        mOfficessAdapter = new OfficesAdapter(officee, keys);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(mOfficessAdapter);
    }

    class officeItemView extends RecyclerView.ViewHolder {
        private TextView mName;
        private TextView mPhone;
        private TextView mDetail;

        private String key;

        public officeItemView(ViewGroup parent) {
            super(LayoutInflater.from(mContext).
                    inflate(R.layout.office_list_item, parent, false));
            mName = (TextView) itemView.findViewById(R.id.name_textview);
            mPhone = (TextView) itemView.findViewById(R.id.phone_textview);
            mDetail = (TextView) itemView.findViewById(R.id.detail_textview);
        }

        public void bind(Offices office, String key) {
            mName.setText(office.getName());
            mPhone.setText(office.getPhone() + "");
            mDetail.setText(office.getDetails());
            this.key = key;
        }
    }

    class OfficesAdapter extends RecyclerView.Adapter<officeItemView> {
        List<Offices> mOfficesList;
        List<String> mKeys;

        public OfficesAdapter(List<Offices> mOfficesList, List<String> mKeys) {
            this.mOfficesList = mOfficesList;
            this.mKeys = mKeys;
        }


        @NonNull
        @Override
        public officeItemView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new officeItemView(parent);
        }

        @Override
        public void onBindViewHolder(@NonNull officeItemView holder, int position) {
            holder.bind(mOfficesList.get(position), mKeys.get(position));

        }

        @Override
        public int getItemCount() {
            return mOfficesList.size();
        }

    }
    public static void logout() {
        user = null;


    }
}

