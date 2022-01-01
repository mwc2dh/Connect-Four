package com.example.myfirstapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TwoPlayerActivity extends AppCompatActivity {
    String[][] board = new String[6][7];
    int turn = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player);
        initializeBoard();
    }

    public void quit(View v) {
        startActivity(new Intent(TwoPlayerActivity.this, MainActivity.class));
    }

    public void initializeBoard() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = "";
            }
        }
    }

    public void fill1(View v) {
        ImageView i = findViewById(R.id.board_piece161);
        ImageView j = findViewById(R.id.board_piece151);
        ImageView k = findViewById(R.id.board_piece141);
        ImageView l = findViewById(R.id.board_piece131);
        ImageView m = findViewById(R.id.board_piece121);
        ImageView n = findViewById(R.id.board_piece111);
        Drawable red = getResources().getDrawable(R.drawable.red);
        Drawable yellow = getResources().getDrawable(R.drawable.yellow);
        if (i.getDrawable().getConstantState().equals(red.getConstantState()) || i.getDrawable().getConstantState().equals(yellow.getConstantState())) {
            if (j.getDrawable().getConstantState().equals(red.getConstantState()) || j.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                if (k.getDrawable().getConstantState().equals(red.getConstantState()) || k.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                    if (l.getDrawable().getConstantState().equals(red.getConstantState()) || l.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                        if (m.getDrawable().getConstantState().equals(red.getConstantState()) || m.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                            if (n.getDrawable().getConstantState().equals(red.getConstantState()) || n.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                                return;
                            } else if (turn % 2 == 0) {
                                Drawable d = getResources().getDrawable(R.drawable.red);
                                n.setImageDrawable(d);
                                n.setImageResource(R.drawable.red);
                                board[0][0] = "red";
                            } else {
                                Drawable d = getResources().getDrawable(R.drawable.yellow);
                                n.setImageDrawable(d);
                                n.setImageResource(R.drawable.yellow);
                                board[0][0] = "yellow";
                            }
                        } else if (turn % 2 == 0) {
                            Drawable d = getResources().getDrawable(R.drawable.red);
                            m.setImageDrawable(d);
                            m.setImageResource(R.drawable.red);
                            board[1][0] = "red";
                        } else {
                            Drawable d = getResources().getDrawable(R.drawable.yellow);
                            m.setImageDrawable(d);
                            m.setImageResource(R.drawable.yellow);
                            board[1][0] = "yellow";
                        }
                    } else if (turn % 2 == 0) {
                        Drawable d = getResources().getDrawable(R.drawable.red);
                        l.setImageDrawable(d);
                        l.setImageResource(R.drawable.red);
                        board[2][0] = "red";
                    } else {
                        Drawable d = getResources().getDrawable(R.drawable.yellow);
                        l.setImageDrawable(d);
                        l.setImageResource(R.drawable.yellow);
                        board[2][0] = "yellow";
                    }
                } else if (turn % 2 == 0) {
                    Drawable d = getResources().getDrawable(R.drawable.red);
                    k.setImageDrawable(d);
                    k.setImageResource(R.drawable.red);
                    board[3][0] = "red";
                } else {
                    Drawable d = getResources().getDrawable(R.drawable.yellow);
                    k.setImageDrawable(d);
                    k.setImageResource(R.drawable.yellow);
                    board[3][0] = "yellow";
                }
            } else if (turn % 2 == 0) {
                Drawable d = getResources().getDrawable(R.drawable.red);
                j.setImageDrawable(d);
                j.setImageResource(R.drawable.red);
                board[4][0] = "red";
            } else {
                Drawable d = getResources().getDrawable(R.drawable.yellow);
                j.setImageDrawable(d);
                j.setImageResource(R.drawable.yellow);
                board[4][0] = "yellow";
            }
        } else {
            if (turn % 2 == 0) {
                Drawable d = getResources().getDrawable(R.drawable.red);
                i.setImageDrawable(d);
                i.setImageResource(R.drawable.red);
                board[5][0] = "red";
            } else {
                Drawable d = getResources().getDrawable(R.drawable.yellow);
                i.setImageDrawable(d);
                i.setImageResource(R.drawable.yellow);
                board[5][0] = "yellow";
            }
        }
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button4);
        Button b5 = findViewById(R.id.button5);
        Button b6 = findViewById(R.id.button6);
        Button b7 = findViewById(R.id.button7);

        if (horizontalWin() || verticalWin() || upwardsDiagonalWin() || downwardsDiagonalWin()) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            win();
        }
        turn++;
    }

    public void fill2(View v) {
        ImageView i = findViewById(R.id.board_piece162);
        ImageView j = findViewById(R.id.board_piece152);
        ImageView k = findViewById(R.id.board_piece142);
        ImageView l = findViewById(R.id.board_piece132);
        ImageView m = findViewById(R.id.board_piece122);
        ImageView n = findViewById(R.id.board_piece112);
        Drawable red = getResources().getDrawable(R.drawable.red);
        Drawable yellow = getResources().getDrawable(R.drawable.yellow);
        if (i.getDrawable().getConstantState().equals(red.getConstantState()) || i.getDrawable().getConstantState().equals(yellow.getConstantState())) {
            if (j.getDrawable().getConstantState().equals(red.getConstantState()) || j.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                if (k.getDrawable().getConstantState().equals(red.getConstantState()) || k.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                    if (l.getDrawable().getConstantState().equals(red.getConstantState()) || l.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                        if (m.getDrawable().getConstantState().equals(red.getConstantState()) || m.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                            if (n.getDrawable().getConstantState().equals(red.getConstantState()) || n.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                                return;
                            } else if (turn % 2 == 0) {
                                Drawable d = getResources().getDrawable(R.drawable.red);
                                n.setImageDrawable(d);
                                n.setImageResource(R.drawable.red);
                                board[0][1] = "red";
                            } else {
                                Drawable d = getResources().getDrawable(R.drawable.yellow);
                                n.setImageDrawable(d);
                                n.setImageResource(R.drawable.yellow);
                                board[0][1] = "yellow";
                            }
                        } else if (turn % 2 == 0) {
                            Drawable d = getResources().getDrawable(R.drawable.red);
                            m.setImageDrawable(d);
                            m.setImageResource(R.drawable.red);
                            board[1][1] = "red";
                        } else {
                            Drawable d = getResources().getDrawable(R.drawable.yellow);
                            m.setImageDrawable(d);
                            m.setImageResource(R.drawable.yellow);
                            board[1][1] = "yellow";
                        }
                    } else if (turn % 2 == 0) {
                        Drawable d = getResources().getDrawable(R.drawable.red);
                        l.setImageDrawable(d);
                        l.setImageResource(R.drawable.red);
                        board[2][1] = "red";
                    } else {
                        Drawable d = getResources().getDrawable(R.drawable.yellow);
                        l.setImageDrawable(d);
                        l.setImageResource(R.drawable.yellow);
                        board[2][1] = "yellow";
                    }
                } else if (turn % 2 == 0) {
                    Drawable d = getResources().getDrawable(R.drawable.red);
                    k.setImageDrawable(d);
                    k.setImageResource(R.drawable.red);
                    board[3][1] = "red";
                } else {
                    Drawable d = getResources().getDrawable(R.drawable.yellow);
                    k.setImageDrawable(d);
                    k.setImageResource(R.drawable.yellow);
                    board[3][1] = "yellow";
                }
            } else if (turn % 2 == 0) {
                Drawable d = getResources().getDrawable(R.drawable.red);
                j.setImageDrawable(d);
                j.setImageResource(R.drawable.red);
                board[4][1] = "red";
            } else {
                Drawable d = getResources().getDrawable(R.drawable.yellow);
                j.setImageDrawable(d);
                j.setImageResource(R.drawable.yellow);
                board[4][1] = "yellow";
            }
        } else {
            if (turn % 2 == 0) {
                Drawable d = getResources().getDrawable(R.drawable.red);
                i.setImageDrawable(d);
                i.setImageResource(R.drawable.red);
                board[5][1] = "red";
            } else {
                Drawable d = getResources().getDrawable(R.drawable.yellow);
                i.setImageDrawable(d);
                i.setImageResource(R.drawable.yellow);
                board[5][1] = "yellow";
            }
        }
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button4);
        Button b5 = findViewById(R.id.button5);
        Button b6 = findViewById(R.id.button6);
        Button b7 = findViewById(R.id.button7);

        if (horizontalWin() || verticalWin() || upwardsDiagonalWin() || downwardsDiagonalWin()) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            win();
        }
        turn++;
    }

    public void fill3(View v) {
        ImageView i = findViewById(R.id.board_piece163);
        ImageView j = findViewById(R.id.board_piece153);
        ImageView k = findViewById(R.id.board_piece143);
        ImageView l = findViewById(R.id.board_piece133);
        ImageView m = findViewById(R.id.board_piece123);
        ImageView n = findViewById(R.id.board_piece113);
        Drawable red = getResources().getDrawable(R.drawable.red);
        Drawable yellow = getResources().getDrawable(R.drawable.yellow);
        if (i.getDrawable().getConstantState().equals(red.getConstantState()) || i.getDrawable().getConstantState().equals(yellow.getConstantState())) {
            if (j.getDrawable().getConstantState().equals(red.getConstantState()) || j.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                if (k.getDrawable().getConstantState().equals(red.getConstantState()) || k.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                    if (l.getDrawable().getConstantState().equals(red.getConstantState()) || l.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                        if (m.getDrawable().getConstantState().equals(red.getConstantState()) || m.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                            if (n.getDrawable().getConstantState().equals(red.getConstantState()) || n.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                                return;
                            } else if (turn % 2 == 0) {
                                Drawable d = getResources().getDrawable(R.drawable.red);
                                n.setImageDrawable(d);
                                n.setImageResource(R.drawable.red);
                                board[0][2] = "red";
                            } else {
                                Drawable d = getResources().getDrawable(R.drawable.yellow);
                                n.setImageDrawable(d);
                                n.setImageResource(R.drawable.yellow);
                                board[0][2] = "yellow";
                            }
                        } else if (turn % 2 == 0) {
                            Drawable d = getResources().getDrawable(R.drawable.red);
                            m.setImageDrawable(d);
                            m.setImageResource(R.drawable.red);
                            board[1][2] = "red";
                        } else {
                            Drawable d = getResources().getDrawable(R.drawable.yellow);
                            m.setImageDrawable(d);
                            m.setImageResource(R.drawable.yellow);
                            board[1][2] = "yellow";
                        }
                    } else if (turn % 2 == 0) {
                        Drawable d = getResources().getDrawable(R.drawable.red);
                        l.setImageDrawable(d);
                        l.setImageResource(R.drawable.red);
                        board[2][2] = "red";
                    } else {
                        Drawable d = getResources().getDrawable(R.drawable.yellow);
                        l.setImageDrawable(d);
                        l.setImageResource(R.drawable.yellow);
                        board[2][2] = "yellow";
                    }
                } else if (turn % 2 == 0) {
                    Drawable d = getResources().getDrawable(R.drawable.red);
                    k.setImageDrawable(d);
                    k.setImageResource(R.drawable.red);
                    board[3][2] = "red";
                } else {
                    Drawable d = getResources().getDrawable(R.drawable.yellow);
                    k.setImageDrawable(d);
                    k.setImageResource(R.drawable.yellow);
                    board[3][2] = "yellow";
                }
            } else if (turn % 2 == 0) {
                Drawable d = getResources().getDrawable(R.drawable.red);
                j.setImageDrawable(d);
                j.setImageResource(R.drawable.red);
                board[4][2] = "red";
            } else {
                Drawable d = getResources().getDrawable(R.drawable.yellow);
                j.setImageDrawable(d);
                j.setImageResource(R.drawable.yellow);
                board[4][2] = "yellow";
            }
        } else {
            if (turn % 2 == 0) {
                Drawable d = getResources().getDrawable(R.drawable.red);
                i.setImageDrawable(d);
                i.setImageResource(R.drawable.red);
                board[5][2] = "red";
            } else {
                Drawable d = getResources().getDrawable(R.drawable.yellow);
                i.setImageDrawable(d);
                i.setImageResource(R.drawable.yellow);
                board[5][2] = "yellow";
            }
        }
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button4);
        Button b5 = findViewById(R.id.button5);
        Button b6 = findViewById(R.id.button6);
        Button b7 = findViewById(R.id.button7);

        if (horizontalWin() || verticalWin() || upwardsDiagonalWin() || downwardsDiagonalWin()) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            win();
        }
        turn++;
    }

    public void fill4(View v) {
        ImageView i = findViewById(R.id.board_piece164);
        ImageView j = findViewById(R.id.board_piece154);
        ImageView k = findViewById(R.id.board_piece144);
        ImageView l = findViewById(R.id.board_piece134);
        ImageView m = findViewById(R.id.board_piece124);
        ImageView n = findViewById(R.id.board_piece114);
        Drawable red = getResources().getDrawable(R.drawable.red);
        Drawable yellow = getResources().getDrawable(R.drawable.yellow);
        if (i.getDrawable().getConstantState().equals(red.getConstantState()) || i.getDrawable().getConstantState().equals(yellow.getConstantState())) {
            if (j.getDrawable().getConstantState().equals(red.getConstantState()) || j.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                if (k.getDrawable().getConstantState().equals(red.getConstantState()) || k.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                    if (l.getDrawable().getConstantState().equals(red.getConstantState()) || l.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                        if (m.getDrawable().getConstantState().equals(red.getConstantState()) || m.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                            if (n.getDrawable().getConstantState().equals(red.getConstantState()) || n.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                                return;
                            } else if (turn % 2 == 0) {
                                Drawable d = getResources().getDrawable(R.drawable.red);
                                n.setImageDrawable(d);
                                n.setImageResource(R.drawable.red);
                                board[0][3] = "red";
                            } else {
                                Drawable d = getResources().getDrawable(R.drawable.yellow);
                                n.setImageDrawable(d);
                                n.setImageResource(R.drawable.yellow);
                                board[0][3] = "yellow";
                            }
                        } else if (turn % 2 == 0) {
                            Drawable d = getResources().getDrawable(R.drawable.red);
                            m.setImageDrawable(d);
                            m.setImageResource(R.drawable.red);
                            board[1][3] = "red";
                        } else {
                            Drawable d = getResources().getDrawable(R.drawable.yellow);
                            m.setImageDrawable(d);
                            m.setImageResource(R.drawable.yellow);
                            board[1][3] = "yellow";
                        }
                    } else if (turn % 2 == 0) {
                        Drawable d = getResources().getDrawable(R.drawable.red);
                        l.setImageDrawable(d);
                        l.setImageResource(R.drawable.red);
                        board[2][3] = "red";
                    } else {
                        Drawable d = getResources().getDrawable(R.drawable.yellow);
                        l.setImageDrawable(d);
                        l.setImageResource(R.drawable.yellow);
                        board[2][3] = "yellow";
                    }
                } else if (turn % 2 == 0) {
                    Drawable d = getResources().getDrawable(R.drawable.red);
                    k.setImageDrawable(d);
                    k.setImageResource(R.drawable.red);
                    board[3][3] = "red";
                } else {
                    Drawable d = getResources().getDrawable(R.drawable.yellow);
                    k.setImageDrawable(d);
                    k.setImageResource(R.drawable.yellow);
                    board[3][3] = "yellow";
                }
            } else if (turn % 2 == 0) {
                Drawable d = getResources().getDrawable(R.drawable.red);
                j.setImageDrawable(d);
                j.setImageResource(R.drawable.red);
                board[4][3] = "red";
            } else {
                Drawable d = getResources().getDrawable(R.drawable.yellow);
                j.setImageDrawable(d);
                j.setImageResource(R.drawable.yellow);
                board[4][3] = "yellow";
            }
        } else {
            if (turn % 2 == 0) {
                Drawable d = getResources().getDrawable(R.drawable.red);
                i.setImageDrawable(d);
                i.setImageResource(R.drawable.red);
                board[5][3] = "red";
            } else {
                Drawable d = getResources().getDrawable(R.drawable.yellow);
                i.setImageDrawable(d);
                i.setImageResource(R.drawable.yellow);
                board[5][3] = "yellow";
            }
        }
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button4);
        Button b5 = findViewById(R.id.button5);
        Button b6 = findViewById(R.id.button6);
        Button b7 = findViewById(R.id.button7);

        if (horizontalWin() || verticalWin() || upwardsDiagonalWin() || downwardsDiagonalWin()) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            win();
        }
        turn++;
    }

    public void fill5(View v) {
        ImageView i = findViewById(R.id.board_piece165);
        ImageView j = findViewById(R.id.board_piece155);
        ImageView k = findViewById(R.id.board_piece145);
        ImageView l = findViewById(R.id.board_piece135);
        ImageView m = findViewById(R.id.board_piece125);
        ImageView n = findViewById(R.id.board_piece115);
        Drawable red = getResources().getDrawable(R.drawable.red);
        Drawable yellow = getResources().getDrawable(R.drawable.yellow);
        if (i.getDrawable().getConstantState().equals(red.getConstantState()) || i.getDrawable().getConstantState().equals(yellow.getConstantState())) {
            if (j.getDrawable().getConstantState().equals(red.getConstantState()) || j.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                if (k.getDrawable().getConstantState().equals(red.getConstantState()) || k.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                    if (l.getDrawable().getConstantState().equals(red.getConstantState()) || l.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                        if (m.getDrawable().getConstantState().equals(red.getConstantState()) || m.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                            if (n.getDrawable().getConstantState().equals(red.getConstantState()) || n.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                                return;
                            } else if (turn % 2 == 0) {
                                Drawable d = getResources().getDrawable(R.drawable.red);
                                n.setImageDrawable(d);
                                n.setImageResource(R.drawable.red);
                                board[0][4] = "red";
                            } else {
                                Drawable d = getResources().getDrawable(R.drawable.yellow);
                                n.setImageDrawable(d);
                                n.setImageResource(R.drawable.yellow);
                                board[0][4] = "yellow";
                            }
                        } else if (turn % 2 == 0) {
                            Drawable d = getResources().getDrawable(R.drawable.red);
                            m.setImageDrawable(d);
                            m.setImageResource(R.drawable.red);
                            board[1][4] = "red";
                        } else {
                            Drawable d = getResources().getDrawable(R.drawable.yellow);
                            m.setImageDrawable(d);
                            m.setImageResource(R.drawable.yellow);
                            board[1][4] = "yellow";
                        }
                    } else if (turn % 2 == 0) {
                        Drawable d = getResources().getDrawable(R.drawable.red);
                        l.setImageDrawable(d);
                        l.setImageResource(R.drawable.red);
                        board[2][4] = "red";
                    } else {
                        Drawable d = getResources().getDrawable(R.drawable.yellow);
                        l.setImageDrawable(d);
                        l.setImageResource(R.drawable.yellow);
                        board[2][4] = "yellow";
                    }
                } else if (turn % 2 == 0) {
                    Drawable d = getResources().getDrawable(R.drawable.red);
                    k.setImageDrawable(d);
                    k.setImageResource(R.drawable.red);
                    board[3][4] = "red";
                } else {
                    Drawable d = getResources().getDrawable(R.drawable.yellow);
                    k.setImageDrawable(d);
                    k.setImageResource(R.drawable.yellow);
                    board[3][4] = "yellow";
                }
            } else if (turn % 2 == 0) {
                Drawable d = getResources().getDrawable(R.drawable.red);
                j.setImageDrawable(d);
                j.setImageResource(R.drawable.red);
                board[4][4] = "red";
            } else {
                Drawable d = getResources().getDrawable(R.drawable.yellow);
                j.setImageDrawable(d);
                j.setImageResource(R.drawable.yellow);
                board[4][4] = "yellow";
            }
        } else {
            if (turn % 2 == 0) {
                Drawable d = getResources().getDrawable(R.drawable.red);
                i.setImageDrawable(d);
                i.setImageResource(R.drawable.red);
                board[5][4] = "red";
            } else {
                Drawable d = getResources().getDrawable(R.drawable.yellow);
                i.setImageDrawable(d);
                i.setImageResource(R.drawable.yellow);
                board[5][4] = "yellow";
            }
        }
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button4);
        Button b5 = findViewById(R.id.button5);
        Button b6 = findViewById(R.id.button6);
        Button b7 = findViewById(R.id.button7);

        if (horizontalWin() || verticalWin() || upwardsDiagonalWin() || downwardsDiagonalWin()) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            win();
        }
        turn++;
    }

    public void fill6(View v) {
        ImageView i = findViewById(R.id.board_piece166);
        ImageView j = findViewById(R.id.board_piece156);
        ImageView k = findViewById(R.id.board_piece146);
        ImageView l = findViewById(R.id.board_piece136);
        ImageView m = findViewById(R.id.board_piece126);
        ImageView n = findViewById(R.id.board_piece116);
        Drawable red = getResources().getDrawable(R.drawable.red);
        Drawable yellow = getResources().getDrawable(R.drawable.yellow);
        if (i.getDrawable().getConstantState().equals(red.getConstantState()) || i.getDrawable().getConstantState().equals(yellow.getConstantState())) {
            if (j.getDrawable().getConstantState().equals(red.getConstantState()) || j.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                if (k.getDrawable().getConstantState().equals(red.getConstantState()) || k.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                    if (l.getDrawable().getConstantState().equals(red.getConstantState()) || l.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                        if (m.getDrawable().getConstantState().equals(red.getConstantState()) || m.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                            if (n.getDrawable().getConstantState().equals(red.getConstantState()) || n.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                                return;
                            } else if (turn % 2 == 0) {
                                Drawable d = getResources().getDrawable(R.drawable.red);
                                n.setImageDrawable(d);
                                n.setImageResource(R.drawable.red);
                                board[0][5] = "red";
                            } else {
                                Drawable d = getResources().getDrawable(R.drawable.yellow);
                                n.setImageDrawable(d);
                                n.setImageResource(R.drawable.yellow);
                                board[0][5] = "yellow";
                            }
                        } else if (turn % 2 == 0) {
                            Drawable d = getResources().getDrawable(R.drawable.red);
                            m.setImageDrawable(d);
                            m.setImageResource(R.drawable.red);
                            board[1][5] = "red";
                        } else {
                            Drawable d = getResources().getDrawable(R.drawable.yellow);
                            m.setImageDrawable(d);
                            m.setImageResource(R.drawable.yellow);
                            board[1][5] = "yellow";
                        }
                    } else if (turn % 2 == 0) {
                        Drawable d = getResources().getDrawable(R.drawable.red);
                        l.setImageDrawable(d);
                        l.setImageResource(R.drawable.red);
                        board[2][5] = "red";
                    } else {
                        Drawable d = getResources().getDrawable(R.drawable.yellow);
                        l.setImageDrawable(d);
                        l.setImageResource(R.drawable.yellow);
                        board[2][5] = "yellow";
                    }
                } else if (turn % 2 == 0) {
                    Drawable d = getResources().getDrawable(R.drawable.red);
                    k.setImageDrawable(d);
                    k.setImageResource(R.drawable.red);
                    board[3][5] = "red";
                } else {
                    Drawable d = getResources().getDrawable(R.drawable.yellow);
                    k.setImageDrawable(d);
                    k.setImageResource(R.drawable.yellow);
                    board[3][5] = "yellow";
                }
            } else if (turn % 2 == 0) {
                Drawable d = getResources().getDrawable(R.drawable.red);
                j.setImageDrawable(d);
                j.setImageResource(R.drawable.red);
                board[4][5] = "red";
            } else {
                Drawable d = getResources().getDrawable(R.drawable.yellow);
                j.setImageDrawable(d);
                j.setImageResource(R.drawable.yellow);
                board[4][5] = "yellow";
            }
        } else {
            if (turn % 2 == 0) {
                Drawable d = getResources().getDrawable(R.drawable.red);
                i.setImageDrawable(d);
                i.setImageResource(R.drawable.red);
                board[5][5] = "red";
            } else {
                Drawable d = getResources().getDrawable(R.drawable.yellow);
                i.setImageDrawable(d);
                i.setImageResource(R.drawable.yellow);
                board[5][5] = "yellow";
            }
        }
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button4);
        Button b5 = findViewById(R.id.button5);
        Button b6 = findViewById(R.id.button6);
        Button b7 = findViewById(R.id.button7);

        if (horizontalWin() || verticalWin() || upwardsDiagonalWin() || downwardsDiagonalWin()) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            win();
        }
        turn++;
    }

    public void fill7(View v) {
        ImageView i = findViewById(R.id.board_piece167);
        ImageView j = findViewById(R.id.board_piece157);
        ImageView k = findViewById(R.id.board_piece147);
        ImageView l = findViewById(R.id.board_piece137);
        ImageView m = findViewById(R.id.board_piece127);
        ImageView n = findViewById(R.id.board_piece117);
        Drawable red = getResources().getDrawable(R.drawable.red);
        Drawable yellow = getResources().getDrawable(R.drawable.yellow);
        if (i.getDrawable().getConstantState().equals(red.getConstantState()) || i.getDrawable().getConstantState().equals(yellow.getConstantState())) {
            if (j.getDrawable().getConstantState().equals(red.getConstantState()) || j.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                if (k.getDrawable().getConstantState().equals(red.getConstantState()) || k.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                    if (l.getDrawable().getConstantState().equals(red.getConstantState()) || l.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                        if (m.getDrawable().getConstantState().equals(red.getConstantState()) || m.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                            if (n.getDrawable().getConstantState().equals(red.getConstantState()) || n.getDrawable().getConstantState().equals(yellow.getConstantState())) {
                                return;
                            } else if (turn % 2 == 0) {
                                Drawable d = getResources().getDrawable(R.drawable.red);
                                n.setImageDrawable(d);
                                n.setImageResource(R.drawable.red);
                                board[0][6] = "red";
                            } else {
                                Drawable d = getResources().getDrawable(R.drawable.yellow);
                                n.setImageDrawable(d);
                                n.setImageResource(R.drawable.yellow);
                                board[0][6] = "yellow";
                            }
                        } else if (turn % 2 == 0) {
                            Drawable d = getResources().getDrawable(R.drawable.red);
                            m.setImageDrawable(d);
                            m.setImageResource(R.drawable.red);
                            board[1][6] = "red";
                        } else {
                            Drawable d = getResources().getDrawable(R.drawable.yellow);
                            m.setImageDrawable(d);
                            m.setImageResource(R.drawable.yellow);
                            board[1][6] = "yellow";
                        }
                    } else if (turn % 2 == 0) {
                        Drawable d = getResources().getDrawable(R.drawable.red);
                        l.setImageDrawable(d);
                        l.setImageResource(R.drawable.red);
                        board[2][6] = "red";
                    } else {
                        Drawable d = getResources().getDrawable(R.drawable.yellow);
                        l.setImageDrawable(d);
                        l.setImageResource(R.drawable.yellow);
                        board[2][6] = "yellow";
                    }
                } else if (turn % 2 == 0) {
                    Drawable d = getResources().getDrawable(R.drawable.red);
                    k.setImageDrawable(d);
                    k.setImageResource(R.drawable.red);
                    board[3][6] = "red";
                } else {
                    Drawable d = getResources().getDrawable(R.drawable.yellow);
                    k.setImageDrawable(d);
                    k.setImageResource(R.drawable.yellow);
                    board[3][6] = "yellow";
                }
            } else if (turn % 2 == 0) {
                Drawable d = getResources().getDrawable(R.drawable.red);
                j.setImageDrawable(d);
                j.setImageResource(R.drawable.red);
                board[4][6] = "red";
            } else {
                Drawable d = getResources().getDrawable(R.drawable.yellow);
                j.setImageDrawable(d);
                j.setImageResource(R.drawable.yellow);
                board[4][6] = "yellow";
            }
        } else {
            if (turn % 2 == 0) {
                Drawable d = getResources().getDrawable(R.drawable.red);
                i.setImageDrawable(d);
                i.setImageResource(R.drawable.red);
                board[5][6] = "red";
            } else {
                Drawable d = getResources().getDrawable(R.drawable.yellow);
                i.setImageDrawable(d);
                i.setImageResource(R.drawable.yellow);
                board[5][6] = "yellow";
            }
        }
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button4);
        Button b5 = findViewById(R.id.button5);
        Button b6 = findViewById(R.id.button6);
        Button b7 = findViewById(R.id.button7);

        if (horizontalWin() || verticalWin() || upwardsDiagonalWin() || downwardsDiagonalWin()) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            win();
        }
        turn++;
    }

    public void win() {
        TextView redWins = findViewById(R.id.redWins);
        TextView yellowWins = findViewById(R.id.yellowWins);
        if (turn % 2 == 0) {
            redWins.setVisibility(View.VISIBLE);
        } else {
            yellowWins.setVisibility(View.VISIBLE);
        }
    }

    public boolean verticalWin() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (board[i][j].equals("red") && board[i + 1][j].equals("red") && board[i + 2][j].equals("red") && board[i + 3][j].equals("red")) {
                   return true;
                }  else if (board[i][j].equals("yellow") && board[i + 1][j].equals("yellow") && board[i + 2][j].equals("yellow") && board[i + 3][j].equals("yellow")) {
                   return true;
                }
            }
        }
        return false;
    }

    public boolean horizontalWin() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j].equals("red") && board[i][j + 1].equals("red") && board[i][j + 2].equals("red") && board[i][j + 3].equals("red")) {
                    return true;
                } else if (board[i][j].equals("yellow") && board[i][j + 1].equals("yellow") && board[i][j + 2].equals("yellow") && board[i][j + 3].equals("yellow")) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean upwardsDiagonalWin() {
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j].equals("red") && board[i - 1][j + 1].equals("red") && board[i - 2][j + 2].equals("red") && board[i - 3][j - 3].equals("red")) {
                    return true;
                } else if (board[i][j].equals("yellow") && board[i - 1][j + 1].equals("yellow") && board[i - 2][j + 2].equals("yellow") && board[i - 3][j - 3].equals("yellow")) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean downwardsDiagonalWin() {
        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 7; j++) {
                if (board[i][j].equals("red") && board[i - 1][j - 1].equals("red") && board[i - 2][j - 2].equals("red") && board[i - 3][j - 3].equals("red")) {
                    return true;
                } else if (board[i][j].equals("yellow") && board[i - 1][j - 1].equals("yellow") && board[i - 2][j - 2].equals("yellow") && board[i - 3][j - 3].equals("yellow")) {
                    return true;
                }
            }
        }
        return false;
    }
}
