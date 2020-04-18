package com.example.colorchange1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    View view;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main2 );

        back = (ImageView) findViewById ( R.id.bck2 );

        TextView text = (TextView)findViewById(R.id.text);

        Intent intent = getIntent();
        String resmsg = intent.getStringExtra("message");
        text.setText(resmsg);


        if (resmsg.toString().equals("Red")) {

            Toast.makeText ( MainActivity2.this, resmsg, Toast.LENGTH_SHORT ).show ();
            view=this.getWindow ().getDecorView ();
            view.setBackgroundResource ( R.color.Bred );

        } else if (resmsg.toString().equals("Orange")) {

            Toast.makeText ( MainActivity2.this, resmsg, Toast.LENGTH_SHORT ).show ();
            view=this.getWindow ().getDecorView ();
            view.setBackgroundResource ( R.color.Borange );

        } else if (resmsg.toString().equals("Yellow")) {

            Toast.makeText ( MainActivity2.this, resmsg, Toast.LENGTH_SHORT ).show ();
            view=this.getWindow ().getDecorView ();
            view.setBackgroundResource ( R.color.Byellow );

        } else if (resmsg.toString().equals("Green")) {

            Toast.makeText ( MainActivity2.this, resmsg, Toast.LENGTH_SHORT ).show ();
            view=this.getWindow ().getDecorView ();
            view.setBackgroundResource ( R.color.Bgreen );

        } else if (resmsg.toString().equals("Blue")) {

            Toast.makeText ( MainActivity2.this, resmsg, Toast.LENGTH_SHORT ).show ();
            view=this.getWindow ().getDecorView ();
            view.setBackgroundResource ( R.color.Bblue );

        } else if (resmsg.toString().equals("Indigo")) {

            Toast.makeText ( MainActivity2.this, resmsg, Toast.LENGTH_SHORT ).show ();
            view=this.getWindow ().getDecorView ();
            view.setBackgroundResource ( R.color.Bindigo );

        } else if (resmsg.toString().equals("Violet")) {

            Toast.makeText ( MainActivity2.this, resmsg, Toast.LENGTH_SHORT ).show ();
            view=this.getWindow ().getDecorView ();
            view.setBackgroundResource ( R.color.Bviolet );

        } else if (resmsg.toString().equals("White")) {

            Toast.makeText ( MainActivity2.this, resmsg, Toast.LENGTH_SHORT ).show ();
            view=this.getWindow ().getDecorView ();
            view.setBackgroundResource ( R.color.Bwhite );

        }

        back.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Toast.makeText ( MainActivity2.this, "You are Back To the Main Menu.", Toast.LENGTH_SHORT ).show ();
                Move1 ();
                finish ();
            }
        } );
    }

    public void Move1(){
        Intent intent= new Intent ( MainActivity2.this, MainActivity.class );
        startActivity ( intent );
    }
}