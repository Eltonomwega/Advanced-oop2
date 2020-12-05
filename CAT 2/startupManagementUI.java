import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javafx.application.Application;

import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;

public class startupManagementUI extends Application implements Hello{

  public AnchorPane anchorPane, anchorPane2;
  public VBox vBox;
  public Button button;
  public ImageView imageView;
  public ImageView imageView0;
  public ImageView imageView1;
  public Button button2;
  public ImageView imageView2;
  public Pane pane;
  public Label label;
  public Pane pane0;
  public Pane pane1;
  public Pane pane2;
  public Button button3;
  public Circle circle;
  public ImageView imageView3;
  public Label label0;
  public Pane pane3;
  public Button button4;
  public Circle circle0;
  public ImageView imageView4;
  public Label label1;
  public Pane pane4;
  public Button button5;
  public Circle circle1;
  public ImageView imageView5;
  public Label label2;
  public Pane pane7;
  public Button button8;
  public Circle circle4;
  public ImageView imageView8;
  public Label label5;

  public void animation() {
    launch();
  }

  @Override
  public void start(Stage stage) {
    anchorPane = new AnchorPane();
    anchorPane2 = new AnchorPane();
    vBox = new VBox();
    button = new Button();
    imageView = new ImageView();
    imageView0 = new ImageView();
    imageView1 = new ImageView();
    button2 = new Button();
    imageView2 = new ImageView();
    pane = new Pane();
    label = new Label();
    pane0 = new Pane();
    pane1 = new Pane();
    pane2 = new Pane();
    button3 = new Button();
    circle = new Circle();
    imageView3 = new ImageView();
    label0 = new Label();
    pane3 = new Pane();
    button4 = new Button();
    circle0 = new Circle();
    imageView4 = new ImageView();
    label1 = new Label();
    pane4 = new Pane();
    button5 = new Button();
    circle1 = new Circle();
    imageView5 = new ImageView();
    label2 = new Label();
  
    pane7 = new Pane();
    button8 = new Button();
    circle4 = new Circle();
    imageView8 = new ImageView();
    label5 = new Label();

    anchorPane2.setMaxHeight(649.0);
    anchorPane2.setMaxWidth(1087.0);
    anchorPane2.setMinHeight(649.0);
    anchorPane2.setMinWidth(1087.0);
    anchorPane2.setPrefHeight(649.0);
    anchorPane2.setPrefWidth(1087.0);
    anchorPane2.setStyle("-fx-background-color: #2F2B43;");

    AnchorPane.setBottomAnchor(anchorPane, 0.0);
    AnchorPane.setLeftAnchor(anchorPane, 0.0);
    AnchorPane.setTopAnchor(anchorPane, 0.0);
    anchorPane.setPrefHeight(519.0);
    anchorPane.setPrefWidth(262.0);
    anchorPane.setStyle("-fx-background-color: #393351;");

    AnchorPane.setBottomAnchor(vBox, 3.0);
    AnchorPane.setLeftAnchor(vBox, 0.0);
    AnchorPane.setTopAnchor(vBox, 160.0);
    vBox.setLayoutY(160.0);
    vBox.setPrefHeight(356.0);
    vBox.setPrefWidth(262.0);

    button.setAlignment(javafx.geometry.Pos.BASELINE_LEFT);
    button.setGraphicTextGap(10.0);
    button.setMnemonicParsing(false);
    button.setPrefHeight(49.0);
    button.setPrefWidth(262.0);
    button.getStyleClass().add("button1");
    button.getStylesheets().add("./fullpackstyling.css");
    button.setText("Home");
    button.setTextFill(javafx.scene.paint.Color.WHITE);

    imageView.setFitHeight(31.0);
    imageView.setFitWidth(35.0);
    imageView.setPickOnBounds(true);
    imageView.setPreserveRatio(true);
    // imageView.setImage(new
    // Image(getClass().getResource("../resources/ben-affleck.png").toExternalForm()));
    button.setGraphic(imageView);
    VBox.setMargin(button, new Insets(0.0));
    button.setPadding(new Insets(0.0, 0.0, 0.0, 40.0));

    
    button2.setAlignment(javafx.geometry.Pos.BASELINE_LEFT);
    button2.setGraphicTextGap(10.0);
    button2.setMnemonicParsing(false);
    button2.setPrefHeight(49.0);
    button2.setPrefWidth(262.0);
    button2.getStyleClass().add("button1");
    button2.getStylesheets().add("./fullpackstyling.css");
    button2.setText("Settings");
    button2.setTextFill(javafx.scene.paint.Color.WHITE);

    imageView2.setFitHeight(31.0);
    imageView2.setFitWidth(35.0);
    imageView2.setPickOnBounds(true);
    imageView2.setPreserveRatio(true);
    // imageView2.setImage(new
    // Image(getClass().getResource("../resources/profile-james-marsden.png").toExternalForm()));
    button2.setGraphic(imageView2);
    button2.setPadding(new Insets(0.0, 0.0, 0.0, 40.0));

    pane.setLayoutY(86.0);
    pane.setPrefHeight(61.0);
    pane.setPrefWidth(262.0);
    pane.setStyle("-fx-background-color: #16a596; -fx-background-radius: 5;");

    label.setLayoutX(25.0);
    label.setLayoutY(17.0);
    label.setText("Home Space");
    label.setTextFill(javafx.scene.paint.Color.WHITE);
    label.setFont(new Font("System Bold", 18.0));

    AnchorPane.setBottomAnchor(pane0, 0.0);
    AnchorPane.setLeftAnchor(pane0, 262.0);
    AnchorPane.setRightAnchor(pane0, -4.0);
    AnchorPane.setTopAnchor(pane0, 0.0);
    pane0.setLayoutX(262.0);
    pane0.setPrefHeight(649.0);
    pane0.setPrefWidth(631.0);

    pane1.setLayoutX(-25.0);
    pane1.setLayoutY(-178.0);
    pane1.setPrefHeight(303.0);
    pane1.setPrefWidth(467.0);
    pane1.setRotate(41.6);
    pane1.setStyle("-fx-background-color: #16a596; -fx-background-radius: 70;");

    pane2.setLayoutX(76.0);
    pane2.setLayoutY(106.0);

    button3.setMnemonicParsing(false);
    button3.setOpacity(0.7);
    button3.setPrefHeight(190.0);
    button3.setPrefWidth(168.0);
    button3.getStyleClass().add("button2");
    button3.getStylesheets().add("./fullpackstyling.css");

    circle.setLayoutX(84.0);
    circle.setLayoutY(87.0);
    circle.setRadius(50.0);
    circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

    imageView3.setFitHeight(49.0);
    imageView3.setFitWidth(37.0);
    imageView3.setLayoutX(66.0);
    imageView3.setLayoutY(68.0);
    imageView3.setPickOnBounds(true);
    imageView3.setPreserveRatio(true);
    // imageView3.setImage(new
    // Image(getClass().getResource("../resources/icons8_Block_50px_1.png").toExternalForm()));

    label0.setAlignment(javafx.geometry.Pos.CENTER);
    label0.setLayoutX(-6.0);
    label0.setLayoutY(146.0);
    label0.setPrefHeight(17.0);
    label0.setPrefWidth(174.0);
    label0.setText("Education");
    label0.setTextFill(javafx.scene.paint.Color.WHITE);
    label0.setFont(new Font("Arial Bold", 13.0));

    pane3.setLayoutX(316.0);
    pane3.setLayoutY(106.0);
    pane3.setPrefHeight(202.0);
    pane3.setPrefWidth(179.0);

    button4.setMnemonicParsing(false);
    button4.setOpacity(0.7);
    button4.setPrefHeight(190.0);
    button4.setPrefWidth(168.0);
    button4.getStyleClass().add("button2");
    button4.getStylesheets().add("./fullpackstyling.css");

    circle0.setLayoutX(84.0);
    circle0.setLayoutY(87.0);
    circle0.setRadius(50.0);
    circle0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

    imageView4.setFitHeight(49.0);
    imageView4.setFitWidth(37.0);
    imageView4.setLayoutX(66.0);
    imageView4.setLayoutY(68.0);
    imageView4.setPickOnBounds(true);
    imageView4.setPreserveRatio(true);
    // imageView4.setImage(new
    // Image(getClass().getResource("../resources/icons8_Car_52px_2.png").toExternalForm()));

    label1.setAlignment(javafx.geometry.Pos.CENTER);
    label1.setLayoutX(1.0);
    label1.setLayoutY(146.0);
    label1.setPrefHeight(17.0);
    label1.setPrefWidth(168.0);
    label1.setText("Transport");
    label1.setTextFill(javafx.scene.paint.Color.WHITE);
    label1.setFont(new Font("Arial Bold", 13.0));

    pane4.setLayoutX(71.0);
    pane4.setLayoutY(354.0);
    pane4.setPrefHeight(202.0);
    pane4.setPrefWidth(179.0);

    button5.setMnemonicParsing(false);
    button5.setOpacity(0.7);
    button5.setPrefHeight(190.0);
    button5.setPrefWidth(168.0);
    button5.getStyleClass().add("button2");
    button5.getStylesheets().add("./fullpackstyling.css");

    circle1.setLayoutX(84.0);
    circle1.setLayoutY(87.0);
    circle1.setRadius(50.0);
    circle1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
    circle1.setFill(new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE,new Stop[] { new Stop(0, Color.WHITE), new Stop(1, Color.DARKSEAGREEN)}));

    imageView5.setFitHeight(49.0);
    imageView5.setFitWidth(37.0);
    imageView5.setLayoutX(66.0);
    imageView5.setLayoutY(68.0);
    imageView5.setPickOnBounds(true);
    imageView5.setPreserveRatio(true);
    // imageView5.setImage(new
    // Image(getClass().getResource("../resources/icons8_Shopping_Cart_50px_2.png").toExternalForm()));

    label2.setAlignment(javafx.geometry.Pos.CENTER);
    label2.setLayoutX(3.0);
    label2.setLayoutY(146.0);
    label2.setPrefHeight(17.0);
    label2.setPrefWidth(168.0);
    label2.setText("Health");
    label2.setTextFill(javafx.scene.paint.Color.WHITE);
    label2.setFont(new Font("Arial Bold", 13.0));


   

 

  

    pane7.setLayoutX(559.0);
    pane7.setLayoutY(106.0);
    pane7.setPrefHeight(190.0);
    pane7.setPrefWidth(174.0);

    button8.setMnemonicParsing(false);
    button8.setOpacity(0.7);
    button8.setPrefHeight(190.0);
    button8.setPrefWidth(168.0);
    button8.getStyleClass().add("button2");
    button8.getStylesheets().add("./fullpackstyling.css");

    circle4.setLayoutX(84.0);
    circle4.setLayoutY(87.0);
    circle4.setRadius(50.0);
    circle4.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

    imageView8.setFitHeight(49.0);
    imageView8.setFitWidth(37.0);
    imageView8.setLayoutX(66.0);
    imageView8.setLayoutY(68.0);
    imageView8.setPickOnBounds(true);
    imageView8.setPreserveRatio(true);
    // imageView8.setImage(new
    // Image(getClass().getResource("../resources/icons8_Play_Button_50px.png").toExternalForm()));

    label5.setAlignment(javafx.geometry.Pos.CENTER);
    label5.setLayoutX(1.0);
    label5.setLayoutY(146.0);
    label5.setPrefHeight(17.0);
    label5.setPrefWidth(168.0);
    label5.setText("Entertainment");
    label5.setTextFill(javafx.scene.paint.Color.WHITE);
    label5.setFont(new Font("Arial Bold", 13.0));

    vBox.getChildren().add(button);
    vBox.getChildren().add(button2);
    anchorPane.getChildren().add(vBox);
    pane.getChildren().add(label);
    anchorPane.getChildren().add(pane);
    anchorPane2.getChildren().add(anchorPane);
    pane0.getChildren().add(pane1);
    pane2.getChildren().add(button3);
    pane2.getChildren().add(circle);
    pane2.getChildren().add(imageView3);
    pane2.getChildren().add(label0);
    pane0.getChildren().add(pane2);
    pane3.getChildren().add(button4);
    pane3.getChildren().add(circle0);
    pane3.getChildren().add(imageView4);
    pane3.getChildren().add(label1);
    pane0.getChildren().add(pane3);
    pane4.getChildren().add(button5);
    pane4.getChildren().add(circle1);
    pane4.getChildren().add(imageView5);
    pane4.getChildren().add(label2);
    pane0.getChildren().add(pane4);
    pane7.getChildren().add(button8);
    pane7.getChildren().add(circle4);
    pane7.getChildren().add(imageView8);
    pane7.getChildren().add(label5);
    pane0.getChildren().add(pane7);
    anchorPane2.getChildren().add(pane0);

    // Creating a scene object
    Scene scene = new Scene(anchorPane2);

    // Setting title to the Stage
    stage.setTitle("Grid Pane Example");

    // Adding scene to the stage
    stage.setScene(scene);

    // Displaying the contents of the stage
    stage.show();
  }

}