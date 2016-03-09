package com.example.user.user;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;



public class UserListMainActivity extends AppCompatActivity implements ExampleItemFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_user_list_view);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new ExampleItemFragment())
                    .commit();
        }
    }

    @Override
    public void onListFragmentInteraction(String item) {
        Toast.makeText(this,"Nacisnieto "+ item,Toast.LENGTH_SHORT).show();

    }
}
