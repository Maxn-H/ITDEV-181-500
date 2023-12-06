package com.example.finalprojecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainPage extends AppCompatActivity {
    Button go;
    Button reset;
    //Button start;
    TextView output;
    EditText rank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        go = findViewById(R.id.go);
        reset = findViewById(R.id.reset);
        output = findViewById(R.id.output);
        rank = findViewById(R.id.rank);
        go.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                if (rank.getText().toString().equals("bronze")) {
                    String[] bronzeSkills = {"Don't jump if unnecessary", "Don't focus on aerials",
                            "Position your car to hit the ball straight",
                            "Dribble the ball in a straight line", "Flip during kickoffs"};
                    for(int i = 0; i < bronzeSkills.length; i++) {
                        output.append(bronzeSkills[i] + "\n");
                    }


                }
                if (rank.getText().toString().equals("silver")) {
                    String[] silverSkills = {"Only play competitive", "Utilize demo's",
                            "Begin offensive training packs", "Change camera settings appropiately",
                            "PLAY DEFENSE!"};
                    for(int i = 0; i < silverSkills.length; i++) {
                        output.append(silverSkills[i] + "\n");
                    }


                }


                if (rank.getText().toString().equals("gold")) {
                    String[] goldSkills = {"Begin Aerial training", "Utilize dunking",
                            "Get familiar with the balancing ball on your car",
                            "Utilize powersliding", "Keep the ball close to your car"
                    };
                    for(int i = 0; i < goldSkills.length; i++) {
                        output.append(goldSkills[i] + "\n");
                    }


                }
                if (rank.getText().toString().equals("platinum")) {
                    String[] platinumSkills = {"Work on flicks", "Improve shadow defense",
                            "Conserve Boost", "Stop camping in net", "Work on double touches"};


                    for(int i = 0; i < platinumSkills.length; i++) {
                        output.append(platinumSkills[i] + "\n");
                    }


                }
                if (rank.getText().toString().equals("diamond")) {
                    String[] diamondSkills = {"Start practicing air dribbles",
                            "Roate with teamates", "Begin backboard defense", "Cheat on kickoffs",
                            "Farm opponent's boost"};


                    for(int i = 0; i < diamondSkills.length; i++) {
                        output.append(diamondSkills[i] + "\n");
                    }


                }
                if (rank.getText().toString().equals("champion")) {
                    String[] championSkills = {"Pass with teamates", "Start flip resets"};
                    for(int i = 0; i < championSkills.length; i++) {
                        output.append(championSkills[i] + "\n");
                    }


                }
                if (rank.getText().toString().equals("grand champ")) {
                    String[] grandChampionSkills = {"Almost there keep grinding",
                            "Don't be a Smurf"};
                    for(int i = 0; i < grandChampionSkills.length; i++) {
                        output.append(grandChampionSkills[i] + "\n");
                    }


                }


            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rank.getText().clear();
                output.setText("");
            }
        });
//}


    }
}