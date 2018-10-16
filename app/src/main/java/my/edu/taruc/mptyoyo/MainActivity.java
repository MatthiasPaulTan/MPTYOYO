package my.edu.taruc.mptyoyo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate=main() function
        super.onCreate(savedInstanceState);

        //To display UI
        //R=resource class
        //layout-= folder name
        setContentView(R.layout.activity_main);
        textViewMsg=findViewById(R.id.textViewMessage);
    }
    //view=class
    //v=instance of a class
    public void showMessage(View v){
        //Linking UI to program
        textViewMsg.setText("Hello, I'm Paul");
    }
    public void clearScreen(View v){
        textViewMsg.setText("");
    }
}
