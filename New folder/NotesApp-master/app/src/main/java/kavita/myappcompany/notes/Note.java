package kavita.myappcompany.notes;

import android.widget.ImageView;

import androidx.appcompat.view.menu.MenuView;

import java.util.ArrayList;

public class Note {

    public String text1;
    public String text2;
    public String text3;
/*public static int j;
public  ImageView bg;*/

    public Note(String a, String b, String c) {
        this.text1 = a;
        this.text2 = b;
        this.text3 = c;
    }

    public String getTitle() {
        return text1;
    }

    public String getSubTitle() {
        return text2;
    }

    public String getDescription() {
        return text3;
    }


    public static ArrayList<Note> createNoteList(int numNotes) {
        ArrayList<Note> notes = new ArrayList<Note>();
        for (int i = 1; i <= numNotes; i++) {
            notes.add(new Note("Title  " + i, "  Subtitle " + i, "Description  "+ i));


        }

        return notes;

    }
}