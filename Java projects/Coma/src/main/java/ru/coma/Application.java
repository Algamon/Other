package ru.coma;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

import java.io.IOException;

@Lazy
@SpringBootApplication
public class Application extends AbstractJavaFxApplicationSupport {

    @Value("${ui.title:comaFX}")//
    private String windowTitle;

    @Qualifier("mainView")
    @Autowired
    private static ConfigurationControllers.View view;

    private static Stage primaryStage;
    private static BorderPane mainLayout;
    private static BorderPane dohodPane;

    @Override
    public void start(Stage stage) throws Exception {
       // Application app = new Application();
        primaryStage = stage;
        primaryStage.setTitle(windowTitle);
        showMain();



        //stage.setTitle(windowTitle);
        //stage.setScene(new Scene(view.getView()));
        //stage.setResizable(true);
        //stage.centerOnScreen();
        //stage.show();
    }
    public void showMain() throws IOException {
        //FXMLLoader loader = new FXMLLoader();
        //loader.setLocation(Application.class.getResource("/FXML/main.fxml"));
        //mainLayout = loader.load();
        mainLayout = new BorderPane(view.getView("fxml/main.fxml"));
        Scene scene = new Scene(mainLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void showDohod() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getResource("/fxml/dohod.fxml"));
        BorderPane bpane = loader.load();
        mainLayout.setCenter(bpane);
    }
    public static void showRashod() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getResource("/fxml/rashod.fxml"));
        BorderPane bpane = loader.load();
        mainLayout.setCenter(bpane);
    }
    public static void showThird() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getResource("/fxml/third.fxml"));
        BorderPane bpane = loader.load();
        mainLayout.setCenter(bpane);
    }
    public static void showTochki() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getResource("/fxml/tochki.fxml"));
        BorderPane bpane = loader.load();
        mainLayout.setCenter(bpane);
    }
    public static void showSotrudniki() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getResource("/fxml/sotrudniki.fxml"));
        BorderPane bpane = loader.load();
        mainLayout.setCenter(bpane);
    }
    public static void showPlanirovanie() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getResource("/fxml/planirovanie.fxml"));
        BorderPane bpane = loader.load();
        mainLayout.setCenter(bpane);
    }
    public static void showSotr_otchet() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getResource("/fxml/sotr_otchet.fxml"));
        BorderPane bpane = loader.load();
        mainLayout.setCenter(bpane);
    }
    public static void showSklad() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getResource("/fxml/sklad.fxml"));
        BorderPane bpane = loader.load();
        mainLayout.setCenter(bpane);
    }
    public static void showOtchety() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getResource("/fxml/otchety.fxml"));
        BorderPane bpane = loader.load();
        mainLayout.setCenter(bpane);
    }
    public static void showOtchety_po_tochkam() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getResource("/fxml/otchety_po_tochkam.fxml"));
        BorderPane bpane = loader.load();
        mainLayout.setCenter(bpane);
    }
    public static void showAnaliz() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Application.class.getResource("/fxml/analiz_otchetov.fxml"));
        BorderPane bpane = loader.load();
        mainLayout.setCenter(bpane);
    }
    public static void main(String[] args) {
        launchApp(Application.class, args);
    }

}
