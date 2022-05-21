package com.example.project2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Image logo = new Image("C:\\Users\\fajoo\\IdeaProjects\\Project2\\logo.png");


        String style = getClass().getResource("Style.css").toExternalForm();
        GridPane mainGP = new GridPane();
        mainGP.setAlignment(Pos.BOTTOM_CENTER);
        TextField expTF = new TextField();
        expTF.setEditable(false);
        expTF.setMaxWidth(Double.MAX_VALUE);
        TextField postFixTF = new TextField();
        postFixTF.setEditable(false);
        postFixTF.setMaxWidth(Double.MAX_VALUE);
        TextField resTF = new TextField();
        resTF.setEditable(false);
        resTF.setMaxWidth(Double.MAX_VALUE);
        VBox mainVB = new VBox();
        //mainVB.setSpacing(5);
        mainVB.setAlignment(Pos.CENTER);


        Button sinB = new Button("sin");
        sinB.setMaxWidth(Double.MAX_VALUE);
        sinB.setOnAction(e -> {
            expTF.appendText("sin( ");
        });
        Button cosB = new Button("cos");
        cosB.setMaxWidth(Double.MAX_VALUE);
        cosB.setOnAction(e -> {
            expTF.appendText("cos( ");
        });
        Button tanB = new Button("tan");
        tanB.setMaxWidth(Double.MAX_VALUE);
        tanB.setOnAction(e -> {
            expTF.appendText("tan( ");
        });
        Button leftParB = new Button("(");
        leftParB.setMaxWidth(Double.MAX_VALUE);
        leftParB.setOnAction(e -> {
            expTF.appendText(" ( ");
        });
        Button rightParB = new Button(" ) ");
        rightParB.setMaxWidth(Double.MAX_VALUE);
        rightParB.setOnAction(e -> {
            expTF.appendText(" ) ");
        });
        Button factorB = new Button("!");
        factorB.setMaxWidth(Double.MAX_VALUE);
        factorB.setOnAction(e -> {
            expTF.appendText(" ! ");
        });
        Button offB = new Button("Off");
        offB.setMaxWidth(Double.MAX_VALUE);
        offB.setOnAction(e -> {
            stage.close();
        });

        // first row ends here
        Button PIB = new Button("π");
        PIB.setMaxWidth(Double.MAX_VALUE);
        PIB.setOnAction(e -> {
            expTF.appendText("π");
        });
        Button ypowxB = new Button("yˣ");
        ypowxB.setMaxWidth(Double.MAX_VALUE);
        ypowxB.setOnAction(e -> {
            expTF.appendText(" ^ "); // mistake----
        });
        Button sevenB = new Button("7");
        sevenB.setMaxWidth(Double.MAX_VALUE);
        sevenB.setOnAction(e -> {
            expTF.appendText("7");
        });
        Button eightB = new Button("8");
        eightB.setMaxWidth(Double.MAX_VALUE);
        eightB.setOnAction(e -> {
            expTF.appendText("8");
        });
        Button nineB = new Button("9");
        nineB.setMaxWidth(Double.MAX_VALUE);
        nineB.setOnAction(e -> {
            expTF.appendText("9");
        });
        Button divideB = new Button("/");
        divideB.setMaxWidth(Double.MAX_VALUE);
        divideB.setOnAction(e -> {
            expTF.appendText(" / ");
        });
        Button nigateB = new Button("(-)");
        nigateB.setMaxWidth(Double.MAX_VALUE);
        nigateB.setOnAction(e -> {
            expTF.appendText("negate( ");
        });


        // second row ends here
        Button squarX = new Button("x²");
        squarX.setMaxWidth(Double.MAX_VALUE);
        squarX.setOnAction(e -> {
            expTF.appendText(" ^ 2 ");
        });
        Button xsqurB = new Button("√x ");
        xsqurB.setMaxWidth(Double.MAX_VALUE);
        xsqurB.setOnAction(e -> {
            expTF.appendText(" √( ");
        });
        Button fourB = new Button("4");
        fourB.setMaxWidth(Double.MAX_VALUE);
        fourB.setOnAction(e -> {
            expTF.appendText("4");
        });
        Button fiveB = new Button("5");
        fiveB.setMaxWidth(Double.MAX_VALUE);
        fiveB.setOnAction(e -> {
            expTF.appendText("5");
        });
        Button sixB = new Button("6");
        sixB.setMaxWidth(Double.MAX_VALUE);
        sixB.setOnAction(e -> {
            expTF.appendText("6");
        });
        Button multiB = new Button("*");
        multiB.setMaxWidth(Double.MAX_VALUE);
        multiB.setOnAction(e -> {
            expTF.appendText(" * ");
        });
        Button caB = new Button("CA");
        caB.setMaxWidth(Double.MAX_VALUE);
        caB.setOnAction(e -> {
            postFixTF.clear();
            resTF.clear();
            expTF.clear();
        });

        // third row ends here
        Button expoB = new Button("eˣ");
        expoB.setMaxWidth(Double.MAX_VALUE);
        expoB.setOnAction(e -> {
            expTF.appendText("e ^ ");
        });
        Button LNB = new Button("LN");
        LNB.setMaxWidth(Double.MAX_VALUE);
        LNB.setOnAction(e -> {
            expTF.appendText("ln( ");
        });
        Button oneB = new Button("1");
        oneB.setMaxWidth(Double.MAX_VALUE);
        oneB.setOnAction(e -> {
            expTF.appendText("1");
        });
        Button twoB = new Button("2");
        twoB.setMaxWidth(Double.MAX_VALUE);
        twoB.setOnAction(e -> {
            expTF.appendText("2");
        });
        Button threeB = new Button("3");
        threeB.setMaxWidth(Double.MAX_VALUE);
        threeB.setOnAction(e -> {
            expTF.appendText("3");
        });
        Button minusB = new Button("-");
        minusB.setMaxWidth(Double.MAX_VALUE);
        minusB.setOnAction(e -> {
            expTF.appendText(" - ");
        });
        Button cB = new Button("C");
        cB.setMaxWidth(Double.MAX_VALUE);
        cB.setOnAction(e -> {
            postFixTF.clear();
            resTF.clear();
            expTF.clear();
        });
        // fourth row ends here
        Button logB = new Button("LOG");
        logB.setMaxWidth(Double.MAX_VALUE);
        logB.setOnAction(e -> {
            expTF.appendText("log( ");
        });
        Button oneOverXB = new Button("¹/ˣ");
        oneOverXB.setMaxWidth(Double.MAX_VALUE);
        oneOverXB.setOnAction(e -> {
            expTF.appendText("1 / ");
        });
        Button zeroB = new Button("0");
        zeroB.setMaxWidth(Double.MAX_VALUE);
        zeroB.setOnAction(e -> {
            expTF.appendText("0");
        });
        Button dotB = new Button(".");
        dotB.setMaxWidth(Double.MAX_VALUE);
        dotB.setOnAction(e -> {
            expTF.appendText(".");
        });
        Button percB = new Button("%");
        percB.setMaxWidth(Double.MAX_VALUE);
        percB.setOnAction(e -> {
            expTF.appendText(" % ");
        });
        Button plusB = new Button("+");
        plusB.setMaxWidth(Double.MAX_VALUE);
        plusB.setOnAction(e -> {
            expTF.appendText(" + ");
        });
        Button delB = new Button("←");
        delB.setMaxWidth(Double.MAX_VALUE);
        delB.setOnAction(e -> {
            char[] halo = expTF.getText().toCharArray();
            String newS = "";
            for (int i = 0; i < halo.length -1; i++){
                newS = newS + halo[i];
            }
            expTF.setText(newS);
        });
        // fifth row ends here
        Button equalsB = new Button("=");
        equalsB.setMaxWidth(Double.MAX_VALUE);
        equalsB.setOnAction(e -> {
            resTF.clear();
            if (checkParameters(expTF.getText())){
                postFixTF.setText(infixToPostFix(expTF.getText()));
                resTF.setText(evalutePostFix(postFixTF.getText()) + "");
            }else
                resTF.setText("syntax error with the parameters");
        });


        mainGP.add(sinB,0,0);
        mainGP.add(cosB,1,0);
        mainGP.add(tanB,2,0);
        mainGP.add(leftParB,3,0);
        mainGP.add(rightParB,4,0);
        mainGP.add(factorB,5,0);
        mainGP.add(offB,6,0);
        mainGP.add(PIB,0,1);
        mainGP.add(ypowxB,1,1);
        mainGP.add(sevenB,2,1);
        mainGP.add(eightB,3,1);
        mainGP.add(nineB,4,1);
        mainGP.add(divideB,5,1);
        mainGP.add(nigateB,6,1);
        mainGP.add(squarX,0,2);
        mainGP.add(xsqurB,1,2);
        mainGP.add(fourB,2,2);
        mainGP.add(fiveB,3,2);
        mainGP.add(sixB,4,2);
        mainGP.add(multiB,5,2);
        mainGP.add(caB,6,2);
        mainGP.add(expoB,0,3);
        mainGP.add(LNB,1,3);
        mainGP.add(oneB,2,3);
        mainGP.add(twoB,3,3);
        mainGP.add(threeB,4,3);
        mainGP.add(minusB,5,3);
        mainGP.add(cB,6,3);
        mainGP.add(logB,0,4);
        mainGP.add(oneOverXB,1,4);
        mainGP.add(zeroB,2,4);
        mainGP.add(dotB,3,4);
        mainGP.add(percB,4,4);
        mainGP.add(plusB,5,4);
        mainGP.add(delB,6,4);

        mainVB.getChildren().addAll(expTF,postFixTF,resTF,mainGP,equalsB);

        Scene scene = new Scene(mainVB, 303, 297);
        scene.getStylesheets().addAll(style);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.getIcons().add(logo);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private boolean checkParameters(String exp){
        boolean res = false;
        Stack<Character> s = new Stack<>();
        char temp;
        char[] c = exp.toCharArray();

        for(int i = 0; i < c.length; i++ ){
            switch (c[i]) {
                case '(':
                    s.push(c[i]);
                    break;
                case '{':
                    s.push(c[i]);
                    break;
                case '[':
                    s.push(c[i]);
                    break;
                case ')':
                    if(s.isEmpty() == false){
                        temp = (char) s.pop();
                        //System.out.println(temp);
                        //System.out.println(c[i]);
                        if (temp != '('){
                            //System.out.println("Erorr1");
                            return false;
                        }
                    } else {
                        return false;
                    }

                    break;
                case ']':
                    if(s.isEmpty() == false){
                        temp = (char) s.pop();
                        if (temp != '['){
                            //System.out.println("Erorr2");
                            return false;
                        }
                    } else {
                        return false;
                    }

                    break;
                case '}':
                    if(s.isEmpty() == false){
                        temp = (char) s.pop();
                        if (temp != '{'){
                            //System.out.println("Erorr3");
                            return false;
                        }
                    } else {
                        return false;
                    }
                    break;
                default:
                    break;
            }

        }
        if(s.peek() != null){
            //System.out.println("Erorr4");
            res = false;
        } else {
            res = true;
        }

        return res;
    }

    static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case '^': case '!':
                return 3;
        }
        return -1;
    }

    private String infixToPostFix(String exp){
        Stack<Character> oprtStack = new Stack<>();
        Stack<String> thinges = new Stack<>();
        String[] newS = exp.split(" ");
        for (int i = newS.length - 1; i >= 0; i--){
            if(!newS[i].equals("")) {
                System.out.println(newS[i]);
                if (newS[i].charAt(0) == 'e') {
                    thinges.push("2.71828");
                } else if (newS[i].charAt(0) == 'π') {
                    thinges.push("3.14159265359");
                } else
                    thinges.push(newS[i]);
            }
        }
        String next = "";
        String res = "";
        char topOpr;
        while (thinges.isEmpty() == false) {
            //System.out.println(thinges.isEmpty());
            next = (String) thinges.pop();
            switch (next) {
                case "^":
                    oprtStack.push('^');
                    break;
                case "+": case "-": case "*": case "/": case "%": case "!":
                    while (oprtStack.isEmpty() == false && precedence((char) oprtStack.peek()) >= precedence(next.charAt(0))) {
                        res+=oprtStack.pop() + " ";
                    }
                    oprtStack.push(next.charAt(0));
                    break;
                case "(":
                    oprtStack.push(next.charAt(0));
                    break;
                case ")":
                    topOpr = (char) oprtStack.pop();
                    while (topOpr != '(') {
                        res += topOpr + " ";
                        topOpr = (char) oprtStack.pop();
                    }
                    break;
                default:
                String evalS = "";
                int par = 1;
                String temp;
                if(next.startsWith("sin(")){
                    System.out.println("Just a test");
                    res += infixToPostFix(getInnerExp(thinges))+ " sin ";
                } else if(next.startsWith("cos(")){
                    res += infixToPostFix(getInnerExp(thinges)) + " cos ";
                }else if(next.startsWith("tan(")){
                    res += infixToPostFix(getInnerExp(thinges))+ " tan ";
                }else if(next.startsWith("√(")){
                    res += infixToPostFix(getInnerExp(thinges))+ " √ ";
                }else if(next.startsWith("ln(")){
                    res += infixToPostFix(getInnerExp(thinges))+ " ln ";
                }else if(next.startsWith("log(")){
                    res += infixToPostFix(getInnerExp(thinges))+ " log ";
                } else if (next.startsWith("negate(")){
                    res += infixToPostFix(getInnerExp(thinges))+ " negate ";
                }else {
                    try{
                        res += Double.parseDouble(next) + " ";
                    } catch (Exception e){
                        System.out.println("Something went wrong");
                    }
                }
            }
        }
        while (!oprtStack.isEmpty()){
            topOpr = (char) oprtStack.pop();
            res += topOpr + " ";
        }
        return res;
    }

    private double evalutePostFix(String exp){
        Stack<Double> valueStack = new Stack<>();
        Stack<Character> oprtStack = new Stack<>();
        Stack<String> thinges = new Stack<>();
        String[] newS = exp.split(" ");
        for (int i = newS.length - 1; i >= 0; i--){
            if(!newS[i].equals("")) {
                System.out.println(newS[i]);
                if (newS[i].charAt(0) == 'e') {
                    thinges.push("2.71828");
                } else if (newS[i].charAt(0) == 'π') {
                    thinges.push("3.14159265359");
                } else
                    thinges.push(newS[i]);
            }
        }
        String next = "";
        char topOpr;
        double res;
        double operOne;
        double operTwo;
        while (thinges.isEmpty() == false){
            next = (String) thinges.pop();
            switch (next){
                case "+": case "-": case "*": case "/": case "%": case "^":
                    operTwo = (double) valueStack.pop();
                    operOne = (double) valueStack.pop();
                    res = evaluate(next.charAt(0), operOne,operTwo);
                    valueStack.push(res);
                    break;
                case "!":
                    valueStack.push((double) fac((double)valueStack.pop()));
                    break;
                default:

                int par = 1;
                String temp;
                if(next.startsWith("sin")){
                    valueStack.push(Math.sin((double) valueStack.pop()));
                } else if(next.startsWith("cos")){
                    valueStack.push(Math.cos((double) valueStack.pop()));
                }else if(next.startsWith("tan")){
                    valueStack.push(Math.tan((double) valueStack.pop()));
                }else if(next.startsWith("√")){
                    valueStack.push(Math.sqrt((double) valueStack.pop()));
                }else if(next.startsWith("ln")){
                    valueStack.push(Math.log((double) valueStack.pop()));
                }else if(next.startsWith("log")){
                    valueStack.push(Math.log10((double) valueStack.pop()));
                } else if (next.startsWith("negate")){
                    valueStack.push(-1 * ((double) valueStack.pop()));
                }else {
                    try{
                        valueStack.push(Double.parseDouble(next));
                    } catch (Exception e){
                        System.out.println("Something went wrong");
                    }
                }
            }

        }

        if(valueStack.peek() == null){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Syntax error");
            a.show();
            return 0;
        }
        return (double) valueStack.peek();
    }

    private double evaluateInfix(String exp) {
        Stack<Double> valueStack = new Stack<>();
        Stack<Character> oprtStack = new Stack<>();
        Stack<String> thinges = new Stack<>();
        boolean facFlag = false;
        String[] newS = exp.split(" ");
        for (int i = newS.length - 1; i >= 0; i--){
            if(!newS[i].equals("")) {
                System.out.println(newS[i]);
                if (newS[i].charAt(0) == 'e') {
                    thinges.push("2.71828");
                } else if (newS[i].charAt(0) == 'π') {
                    thinges.push("3.14159265359");
                } else
                    thinges.push(newS[i]);
            }
        }
        String next = "";
        char topOpr;
        double operOne;
        double operTwo;
        while (thinges.isEmpty() == false){
            //System.out.println(thinges.isEmpty());
            next = (String) thinges.pop();
            switch (next){
                case "^":
                    oprtStack.push('^');
                    break;
                case "+": case "-": case "*": case "/": case "%":
                    while(oprtStack.isEmpty()==false && precedence((char) oprtStack.peek())>=precedence(next.charAt(0))){
                        topOpr = (char) oprtStack.pop();
                        operTwo = (double) valueStack.pop();
                        operOne = (double) valueStack.pop();
                        valueStack.push(evaluate(topOpr,operOne,operTwo));
                    }
                    oprtStack.push(next.charAt(0));
                    //System.out.println(oprtStack.peek());
                    break;
                case "!":
                    valueStack.push((double) fac((double)valueStack.pop()));
                    break;
                case "(":
                    oprtStack.push(next.charAt(0));
                    break;
                case ")":
                    topOpr = (char) oprtStack.pop();
                    while (topOpr != '('){
                        operTwo = (double) valueStack.pop();
                        operOne = (double) valueStack.pop();
                        valueStack.push(evaluate(topOpr,operOne,operTwo));
                        topOpr = (char) oprtStack.pop();
                    }
                default:
                    String evalS = "";
                    int par = 1;
                    String temp;
                    if(next.startsWith("sin(")){
                        valueStack.push(Math.sin((evaluateInfix(getInnerExp(thinges)))));
                    } else if(next.startsWith("cos(")){
                        valueStack.push(Math.cos((evaluateInfix(getInnerExp(thinges)))));
                    }else if(next.startsWith("tan(")){
                        valueStack.push(Math.tan((evaluateInfix(getInnerExp(thinges)))));
                    }else if(next.startsWith("√(")){
                        valueStack.push(Math.sqrt(evaluateInfix(getInnerExp(thinges))));
                    }else if(next.startsWith("ln(")){
                        valueStack.push(Math.log(evaluateInfix(getInnerExp(thinges))));
                    }else if(next.startsWith("log(")){
                        valueStack.push(Math.log10(evaluateInfix(getInnerExp(thinges))));
                    } else if (next.startsWith("negate(")){
                        valueStack.push(-1 * (evaluateInfix(getInnerExp(thinges))));
                    }else {
                        try{
                            if(facFlag){
                                valueStack.push((double) fac((int) Double.parseDouble(next)));
                            }else
                                valueStack.push(Double.parseDouble(next));
                        } catch (Exception e){
                            System.out.println("Something went wrong");
                        }
                    }
            }
        }
        while (!oprtStack.isEmpty()){
            if((char) oprtStack.peek() != '!') {
                topOpr = (char) oprtStack.pop();
                operTwo = (double) valueStack.pop();
                operOne = (double) valueStack.pop();
                valueStack.push(evaluate(topOpr, operOne, operTwo));
            } else
                valueStack.push((double) fac((double)valueStack.pop()));
            oprtStack.pop();
        }
        return (double) valueStack.peek();
    }

    private String getInnerExp(Stack thinges){
        String evalS = "";
        int par = 1;
        String temp;
        while(par != 0){
            temp = (String) thinges.pop();
            System.out.println(temp);
            if(temp.equals(")")){
                par--;
                if(par >= 1)
                    evalS += " " +  temp + " ";
            } else {
                if(temp.length() > 1 && temp.endsWith("(")){
                    evalS += temp + " ";
                    par++;
                } else {
                    evalS += temp + " ";
                    if(temp.equals("("))
                        par++;
                }
            }
        }
        return evalS;
    }

    private double evaluate(char o, double first, double scound){
        switch (o){
            case '+':
                return first + scound;
            case '-':
                return first - scound;
            case '*':
                return first * scound;
            case '/':
                return first / scound;
            case '%':
                return first % scound;
            case '^': case '!':
                return Math.pow(first, scound);
        }
        return 0;
    }

    private int fac(double number){
        int n = (int) number;
        int i,fact=1;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

}