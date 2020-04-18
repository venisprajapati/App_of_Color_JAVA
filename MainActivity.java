package com.example.colorchange1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    ImageView exit;
    public Button brd, bor, byl, bgr, bbl, bin, bvl, bwh;
    public String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


        exit = (ImageView) findViewById ( R.id.ext1 );
        brd = (Button) findViewById ( R.id.bred );
        bor = (Button) findViewById ( R.id.borange );
        byl = (Button) findViewById ( R.id.byellow );
        bgr = (Button) findViewById ( R.id.bgreen );
        bbl = (Button) findViewById ( R.id.bblue );
        bin = (Button) findViewById ( R.id.bindigo );
        bvl = (Button) findViewById ( R.id.bviolet );
        bwh = (Button) findViewById ( R.id.bwhite );

        //Color Section...

        brd.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Button brd = (Button) findViewById ( v.getId () );
                String msg = brd.getText ().toString ();

                Intent intent = new Intent ( getApplicationContext (), MainActivity2.class );
                intent.putExtra ( "message", msg );
                startActivity ( intent );

                //Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();

                finish ();

            }
        } );

        bor.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Button brd = (Button) findViewById ( v.getId () );
                String msg = brd.getText ().toString ();

                Intent intent = new Intent ( getApplicationContext (), MainActivity2.class );
                intent.putExtra ( "message", msg );
                startActivity ( intent );

                //Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();

                finish ();
            }
        } );

        byl.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Button brd = (Button) findViewById ( v.getId () );
                String msg = brd.getText ().toString ();

                Intent intent = new Intent ( getApplicationContext (), MainActivity2.class );
                intent.putExtra ( "message", msg );
                startActivity ( intent );

                //Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();

                finish ();
            }
        } );

        bgr.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Button brd = (Button) findViewById ( v.getId () );
                String msg = brd.getText ().toString ();

                Intent intent = new Intent ( getApplicationContext (), MainActivity2.class );
                intent.putExtra ( "message", msg );
                startActivity ( intent );

                //Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();

                finish ();
            }
        } );

        bbl.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Button brd = (Button) findViewById ( v.getId () );
                String msg = brd.getText ().toString ();

                Intent intent = new Intent ( getApplicationContext (), MainActivity2.class );
                intent.putExtra ( "message", msg );
                startActivity ( intent );

                //Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();

                finish ();
            }
        } );

        bin.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Button brd = (Button) findViewById ( v.getId () );
                String msg = brd.getText ().toString ();

                Intent intent = new Intent ( getApplicationContext (), MainActivity2.class );
                intent.putExtra ( "message", msg );
                startActivity ( intent );

                //Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();

                finish ();
            }
        } );

        bvl.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Button brd = (Button) findViewById ( v.getId () );
                String msg = brd.getText ().toString ();

                Intent intent = new Intent ( getApplicationContext (), MainActivity2.class );
                intent.putExtra ( "message", msg );
                startActivity ( intent );

                //Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();

                finish ();
            }
        } );

        bwh.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Button brd = (Button) findViewById ( v.getId () );
                String msg = brd.getText ().toString ();

                Intent intent = new Intent ( getApplicationContext (), MainActivity2.class );
                intent.putExtra ( "message", msg );
                startActivity ( intent );

                //Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();

                finish ();
            }
        } );



        exit.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                finish ();

                Toast.makeText ( MainActivity.this, "App is Closed.", Toast.LENGTH_SHORT ).show ();
            }
        } );
    }
}