package com.codepath.apps.restclienttemplate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.codepath.apps.restclienttemplate.models.Tweet;
import com.codepath.apps.restclienttemplate.models.User;

import org.parceler.Parcels;

import jp.wasabeef.glide.transformations.RoundedCornersTransformation;

public class TweetDetailActivity extends AppCompatActivity {
    Context context;

   TextView tvBody;
   TextView tvUserName;
   TextView tvCreateAt;
   ImageView ivimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweet_detail);

        tvBody = findViewById(R.id.tvBody);
        tvUserName = findViewById(R.id.tvUserName);
        tvCreateAt = findViewById(R.id.tvCreateAt);
        //ivimg =findViewById(R.id.ivimg);

        Tweet tweet = Parcels.unwrap(getIntent().getParcelableExtra("tweet"));
        //User user  = Parcels.unwrap(getIntent().getParcelableExtra("user"));

        //Uri uri = Uri.parse(tweet.user.profileImageUrl);
       // ivimg.setImageURI(uri);

        tvBody.setText(tweet.body);
        tvUserName.setText(tweet.user.screenName);
        tvCreateAt.setText(tweet.createdAt);




    }

}

