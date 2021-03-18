package kavita.myappcompany.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static ArrayList<Note> notes;
    static RecyclerView recyclerView;
    static RelativeLayout relativeLayout;
    FloatingActionButton floatingActionButton;
    ImageView imageView;
    static notesAdapter adapter;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
imageView=findViewById(R.id.bg_image_mainpage);

   if (notes.size() == 0) {
            recyclerView.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);

        } else {
            recyclerView.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.GONE);
        }
        adapter = new notesAdapter(notes);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView = findViewById(R.id.RVnotes);
        floatingActionButton = findViewById(R.id.add_note_button);
        relativeLayout = findViewById(R.id.relative_layout);
        linearLayout = findViewById(R.id.linear_layout);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                Intent intent = new Intent(getApplicationContext(), createNote.class);
                startActivity(intent);
            }

        });
    }



        void onNoteClick ( View view)
        {
            Intent intent = new Intent(getApplicationContext(), createNote.class);

            startActivity(intent);
        }


}


