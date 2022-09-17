package ferreira.juan.galeriapublica;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.Manifest;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

   BottomNavigationView bottomNavigationView;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      final MainViewModel vm = new ViewModelProvider(this).get(MainViewModel.class);

      bottomNavigationView = findViewById(R.id.btNav);
      bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
         @Override
         public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            vm.setNavigationOpSelected(item.getItemId());
            switch (item.getItemId()) {
               case R.id.gridViewOp:
                  GridViewFragment gridViewFragment = GridViewFragment.newInstance();
                  setFragment(gridViewFragment);
                  break;
               case R.id.listViewOp:
                  ListViewFragment listViewFragment = ListViewFragment.newInstance();
                  setFragment(listViewFragment);
                  break;
            }
            return true;
         }

      });
   }
   private void setFragment(GridViewFragment gridViewFragment) {
   }

   private void setFragment(ListViewFragment listViewFragment) {
   }
}