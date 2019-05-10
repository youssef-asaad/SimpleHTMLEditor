package com.samapalmyra.htmleditor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtHTML;
    Button btnNew;
    Button btnRun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHTML = (EditText) findViewById(R.id.txtHTML);
        btnNew = (Button) findViewById(R.id.btnNew);
        btnRun = (Button) findViewById(R.id.btnRun);

        String strStartHTML = "" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "input{\n" +
                "font-size:25px;\n" +
                "font-weight:bold;\n" +
                "width:300px;\n" +
                "color:blue;\n" +
                "background:lightblue;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>Test About HTML & CSS & JavaScript</h1>\n" +
                "<h2>Press On Submit Button</h2>\n" +
                "<input id='txt' />\n<br />\n" +
                "<input type='submit' onclick='window.txt.value+=7;'>\n" +
                "</body>\n" +
                "</html>";

        txtHTML.setText(strStartHTML);

        final Intent myAct = new Intent(this, actRun.class);
        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myVar.strHTML = txtHTML.getText() + "";
                startActivity(myAct);
            }
        });
        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strNewHTML = "" +
                        "<html>\n" +
                        "<head>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>";
                txtHTML.setText(strNewHTML);
            }

        });

    }
}
