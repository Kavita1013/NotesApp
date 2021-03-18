package kavita.myappcompany.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;






public class createNote extends AppCompatActivity {

     public static ArrayList<Note>  notes;
     EditText titleText,subTitleText,descriptionText;
     Integer position;
     FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_note);

        titleText=findViewById(R.id.notesTitle);
        subTitleText=findViewById(R.id.notesSubTitle);
        descriptionText=findViewById(R.id.notesText);
        floatingActionButton=findViewById(R.id.save_note_button);
        Intent intent=getIntent();
        position=intent.getIntExtra("position",0);
        displayNote();


        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {



            }
        });
    }




    void displayNote(){
        if(position!=0){
            titleText.setText(MainActivity.notes.get(position).getTitle());
            subTitleText.setText((MainActivity.notes.get(position).getSubTitle()));
            descriptionText.setText(MainActivity.notes.get(position).getDescription());
        }
    }

}