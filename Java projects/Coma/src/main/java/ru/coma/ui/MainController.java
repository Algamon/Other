package ru.coma.ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import ru.coma.Application;
import ru.coma.ConfigurationControllers;
import ru.coma.entity.Rashody;
import ru.coma.service.ContactService;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.List;


@SuppressWarnings("SpringJavaAutowiringInspection")
public class MainController {
    private Logger logger = LoggerFactory.getLogger(MainController.class);
    @Qualifier("mainView")
    @Autowired
    private ConfigurationControllers.View view;
    // Инъекции Spring
    @Autowired private ContactService contactService;
    /*private ObservableList<Consumption> usersData = FXCollections.observableArrayList();

    @FXML
    private TableView<Consumption> tableConsumption;

    @FXML
    private TableColumn<Consumption, String> dateColumn;

    @FXML
    private TableColumn<Consumption, String> rashodColumn;

    @FXML
    private TableColumn<Consumption, String> statiaColumn;

    @FXML
    private TableColumn<Consumption, String> osnovanieColumn;

    // инициализируем форму данными

    @SuppressWarnings("unchecked")
    @PostConstruct
    private void init() {
        initData();

        // устанавливаем тип и значение которое должно хранится в колонке
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("Дата"));
        rashodColumn.setCellValueFactory(new PropertyValueFactory<>("Расходы"));
        statiaColumn.setCellValueFactory(new PropertyValueFactory<>("Статья"));
        osnovanieColumn.setCellValueFactory(new PropertyValueFactory<>("Основание"));

        // заполняем таблицу данными
        tableConsumption.setItems(usersData);
    }

    // подготавливаем данные для таблицы
    // вы можете получать их с базы данных
    private void initData() {
        usersData.add(new Consumption("12", "Alex", "qwerty", "alex@mail.com"));
        usersData.add(new Consumption("", "Bob", "dsfsdfw", "bob@mail.com"));
        usersData.add(new Consumption("", "Jeck", "dsfdsfwe", "Jeck@mail.com"));
        usersData.add(new Consumption("", "Mike", "iueern", "mike@mail.com"));
        usersData.add(new Consumption("", "colin", "woeirn", "colin@mail.com"));
    }*/




    // Инъекции JavaFX
    @FXML private TableView<Rashody> tableConsumption;
    @FXML private TableColumn<Rashody,Integer> idColumn;
    @FXML private TableColumn<Rashody,String> dateColumn;
    @FXML private TableColumn<Rashody,String> rashodColumn;
    @FXML private TableColumn<Rashody,String> statiaColumn;
    @FXML private TableColumn<Rashody,String> osnovanieColumn;

    // Variables

    private ObservableList<Rashody> data;
    /*
    ** Инициализация контроллера от JavaFX.
     * Метод вызывается после того как FXML загрузчик произвел инъекции полей.
     *
     * Обратите внимание, что имя метода <b>обязательно</b> должно быть "initialize",
     * в противном случае, метод не вызовется.
     *
     * Также на этом этапе еще отсутствуют бины спринга
     * и для инициализации лучше использовать метод,
     * описанный аннотацией @PostConstruct,
     * который вызовется спрингом, после того, как им будут произведены все инъекции.
     * {@link MainController#init()}
     */
    @FXML
    public void initialize() {
    }

    /**
     * На этом этапе уже произведены все возможные инъекции.
     */
    @SuppressWarnings("unchecked")
    @PostConstruct
    @FXML
    public void init() {
        List<Rashody> contacts = contactService.findAll();
        data = FXCollections.observableArrayList(contacts);

        // Столбцы таблицы
        TableColumn<Rashody, String> idColumn = new TableColumn<>("id");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        TableColumn<Rashody, String> dateColumn = new TableColumn<>("Дата");
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("Date"));

        TableColumn<Rashody, String> rashodColumn = new TableColumn<>("Расходы");
        rashodColumn.setCellValueFactory(new PropertyValueFactory<>("Rashodi"));

        TableColumn<Rashody, String> statiaColumn = new TableColumn<>("Статья");
        statiaColumn.setCellValueFactory(new PropertyValueFactory<>("Statia"));

        TableColumn<Rashody, String> osnovanieColumn = new TableColumn<>("Основание");
        osnovanieColumn.setCellValueFactory(new PropertyValueFactory<>("Osnovanie"));

        tableConsumption.getColumns().setAll(idColumn,dateColumn, rashodColumn, statiaColumn, osnovanieColumn);

        // Данные таблицы
        tableConsumption.setItems(data);
    }

    /**
     * Метод, вызываемый при нажатии на кнопку "Добавить".
     * Привязан к кнопке в FXML файле представления.
     */
    /*@FXML
    public void addContact() {
        Rashody contact = new Rashody(txtName.getText(), txtPhone.getText(), txtEmail.getText());
        contactService.save(contact);
        data.add(contact);

        // чистим поля
        txtName.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
    }*/
    @FXML
    public void showFirstDohod()throws IOException {
        Application.showDohod();
    }
    @FXML
    public void showFirstRashod()throws IOException {
        Application.showRashod();
    }
    @FXML
    public void showFirstThird()throws IOException {
        Application.showThird();
    }
    @FXML
    public void showFirstTochki()throws IOException {
        Application.showTochki();
    }
    @FXML
    public void showFirstSotrudniki()throws IOException {
        Application.showSotrudniki();
    }
    @FXML
    public void showFirstPlanirovanie()throws IOException {
        Application.showPlanirovanie();
    }
    @FXML
    public void showFirstPoTochkam()throws IOException {
        Application.showOtchety_po_tochkam();
    }
    @FXML
    public void showFirstSklad()throws IOException {
        Application.showSklad();
    }
    @FXML
    public void showFirstOtchety()throws IOException {
        Application.showOtchety();
    }
    @FXML
    public void showFirstOtchet()throws IOException {
        Application.showSotr_otchet();
    }
    @FXML
    public void showFirstAnaliz()throws IOException {
        Application.showAnaliz();
    }
}
