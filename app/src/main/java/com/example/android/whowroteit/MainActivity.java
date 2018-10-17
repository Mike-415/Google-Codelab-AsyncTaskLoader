package com.example.android.whowroteit;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class MainActivity extends AppCompatActivity {
    private EditText mBookInput;
    private TextView mTitleText;
    private TextView mAuthorText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBookInput = findViewById(R.id.bookInput);
        mTitleText = findViewById(R.id.titleText);
        mAuthorText = findViewById(R.id.authorText);
    }

    public void searchBooks(View view) {
        // Get the search string from the input field.
        String queryString = mBookInput.getText().toString();
    }

    private class FetchBook extends AsyncTask<String, Void, String> {
        //REMEMBER: weak references prevent memory leaks by allowing
        // the objevct held by that reference to be garbage-collected
        // if necessary
        private WeakReference<TextView> mTitleText;
        private WeakReference<TextView> mAuthorText;

        FetchBook(TextView titleText, TextView authorText){
            mTitleText = new WeakReference<>(titleText);
            mAuthorText = new WeakReference<>(authorText);
        }

        @Override
        protected String doInBackground(String... strings) {
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }
    }
}
