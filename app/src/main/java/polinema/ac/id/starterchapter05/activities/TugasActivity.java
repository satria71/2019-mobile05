package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.HandStandFragment;
import polinema.ac.id.starterchapter05.fragments.PushUpFragment;

public class TugasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .add(R.id.fragment_placeholder, new PushUpFragment())
                    .commit();
        }

    }

    public void handlePushupFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);

        if (fragment == null || fragment instanceof DipsFragment || fragment instanceof HandStandFragment) {
            getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .replace(R.id.fragment_placeholder, new PushUpFragment())
                    .commit();
        }
    }

    public void handleDipsFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);

        if (fragment == null || fragment instanceof PushUpFragment || fragment instanceof HandStandFragment) {
            getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .replace(R.id.fragment_placeholder, new DipsFragment())
                    .commit();
        }
    }

    public void handleHandstandFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);

        if (fragment == null || fragment instanceof PushUpFragment || fragment instanceof DipsFragment) {
            getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .replace(R.id.fragment_placeholder, new HandStandFragment())
                    .commit();
        }
    }
}
