package daniel.daniel_week1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MrPotatohead extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mr_potatohead);
    }
    public void checkbox(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.armsbox:
                ImageView Arms = (ImageView) findViewById(R.id.Arms);
                if (checked)  {
                    Arms.setVisibility(View.VISIBLE);
                } else {
                    Arms.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.mustachebox:
                ImageView Mustache = (ImageView) findViewById(R.id.Mustache);
                if (checked)  {
                    Mustache.setVisibility(View.VISIBLE);
                } else {
                    Mustache.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.mouthbox:
                ImageView Mouth = (ImageView) findViewById(R.id.Mouth);
                if (checked)  {
                    Mouth.setVisibility(View.VISIBLE);
                } else {
                    Mouth.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.eyesbox:
                ImageView Eyes = (ImageView) findViewById(R.id.Eyes);
                if (checked)  {
                    Eyes.setVisibility(View.VISIBLE);
                } else {
                    Eyes.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.glassesbox:
                ImageView Glasses = (ImageView) findViewById(R.id.Glasses);
                if (checked)  {
                    Glasses.setVisibility(View.VISIBLE);
                } else {
                    Glasses.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.earsbox:
                ImageView Ears = (ImageView) findViewById(R.id.Ears);
                if (checked)  {
                    Ears.setVisibility(View.VISIBLE);
                } else {
                    Ears.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.nosebox:
                ImageView Nose = (ImageView) findViewById(R.id.Nose);
                if (checked)  {
                    Nose.setVisibility(View.VISIBLE);
                } else {
                    Nose.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.eyebrowsbox:
                ImageView Eyebrows = (ImageView) findViewById(R.id.Eyebrows);
                if (checked)  {
                    Eyebrows.setVisibility(View.VISIBLE);
                } else {
                    Eyebrows.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.shoesbox:
                ImageView Shoes = (ImageView) findViewById(R.id.Shoes);
                if (checked)  {
                    Shoes.setVisibility(View.VISIBLE);
                } else {
                    Shoes.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.hatbox:
                ImageView Hat = (ImageView) findViewById(R.id.Hat);
                if (checked)  {
                    Hat.setVisibility(View.VISIBLE);
                } else {
                    Hat.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}
