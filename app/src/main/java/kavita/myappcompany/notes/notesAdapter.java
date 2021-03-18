package kavita.myappcompany.notes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;



public class notesAdapter extends
        RecyclerView.Adapter<notesAdapter.ViewHolder>{


    public class ViewHolder extends RecyclerView.ViewHolder {

        public EditText titleText;
        public EditText subtitleText;
        public FloatingActionButton button1;
        public EditText descriptionText;
        public  ImageView imageView;



        public ViewHolder(View itemView) {
            super(itemView);
            titleText = itemView.findViewById(R.id.notesTitle);
            subtitleText = itemView.findViewById(R.id.notesSubTitle);
            descriptionText= itemView.findViewById(R.id.notesText);
            button1 = itemView.findViewById(R.id.save_note_button);
imageView=itemView.findViewById(R.id.bg_image_mainpage);


        }



    }
    public interface  OnNoteListener{
        void onNoteClick(int positions);
    }

        private List<Note> mNotes;

        public notesAdapter(List<Note> notes1){
            mNotes=notes1;

        }

        public notesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Context context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);

            View NoteView = inflater.inflate(R.layout.card_layout, parent, false);

            ViewHolder viewHolder = new ViewHolder(NoteView);
            return viewHolder;
        }

        public void onBindViewHolder(notesAdapter.ViewHolder holder, int position) {

            Note notes = mNotes.get(position);

            EditText editText = holder.titleText;
            editText.setText(notes.getTitle());

            EditText editText1 = holder.subtitleText;
            editText1.setText(notes.getSubTitle());

            EditText editText2 = holder.descriptionText;
            editText2.setText(notes.getDescription());


        }

        public int getItemCount() {
            return mNotes.size();
        }
    }

