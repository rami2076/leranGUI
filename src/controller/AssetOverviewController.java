package controller;

import application.MainApp;
import beans.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AssetOverviewController {
	//一つ目のテーブル定義
	@FXML
	private TableView<Person> dateTable;
	@FXML
	private TableColumn<Person,String> yearColumn;
	@FXML
	private TableColumn<Person,String> monthColumn;

	//	詳細表示画面の日付表示タイトルラベル
	@FXML
	private Label titleLabel;

//二つ目のテーブル定義
	//TODO::diamond type
	@FXML
	private TableView summeryTable;
	@FXML
	private TableColumn dateColumn;
	@FXML
	private TableColumn balanceColumn;
	@FXML
	private TableColumn rateColumn;
	@FXML
	private TableColumn tradeColumn;

	//月全体のまとめ
	@FXML
	private Label summeryLabel;
	@FXML
	private Label rateLabel;
	@FXML
	private Label tradeCountlabel;

	//各種ボタン
	@FXML
	private Button graphButton;
	@FXML
	private Button excelButton;
	@FXML
	private Button printoutButton;
	@FXML
	private Button addDateButton;

//サーチbox
	@FXML
	private TextField searchTextField;

//
//
//	//Reference to the main application.
	private MainApp mainApp;

///
//	// it is run after Inititialize()
//	public AssetOverviewController(){
//
//	}
//	/*
//	/**
//	 * Initializes the controller class. This method is automatically called
//	 * after the fxml file has been loaded.
//	 */
//	@FXML
//	private void initialize(){
//		 // Initialize the person table with the two columns.
//		// I need  to know cellvalueFactory.
//		firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
//		lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
//		//Clear person details.
//		showPersonDetails(null);
//		//Listen for selection changes and show the person details when changed.
//		personTable.getSelectionModel().selectedItemProperty().addListener(
//			(observable,oldValue,newValue)->showPersonDetails(newValue));
//
//	}
//	//解析中↓
//	/**
//	 * Is called by the main application to give a reference back to itself.
//	 *
//	 * @param mainApp
//	 */
	public void setMainApp(MainApp mainApp ){
		this.mainApp = mainApp;
		// Add observable list data to the table
		//personTable.setItems(mainApp.getPersonData());
	}
}
//
//
//	/**
//	 *Fills all text fields to show details about the person.
//	 *if the specified is null , all text fields are cleared.
//	 *
//	 * @param person the person or null
//	 */
//	private void showPersonDetails(Person person){
//		if(person != null){
//			//fill the labels with info from the person object.
//			firstNameLabel.setText(person.getFirstName());
//			lastNameLabel.setText(person.getLastName());
//			streetLabel.setText(person.getStreet());
//			postalCodeLabel.setText(Integer.toString(person.getPostalCode()));
//			cityLabel.setText(person.getCity());
//			birthdayLabel.setText(DateUtil.format(person.getBirthday()));
//
//			//TODO::  we need a way to convert the birthday  into a String.
//			//birthdayLabel.setText(person.getBirthday(...));
//		}else{
//			//person is null, remove  all the text
//			firstNameLabel.setText("");
//			lastNameLabel.setText("");
//			postalCodeLabel.setText("");
//			streetLabel.setText("");
//			cityLabel.setText("");
//			birthdayLabel.setText("");
//
//		}
//	}
//
//	/**
//	 * Called when the user click on the delete button.
//	 */
//	@FXML
//	private  void handleDeletePerson( ){
//		int selctedIndex = personTable.getSelectionModel().getSelectedIndex();
//		try{
//			if(selctedIndex >=0){
//		personTable.getItems().remove(selctedIndex);
//			}else{
//				//nothing selected.
//				Alert alert = new Alert(AlertType.WARNING);
//				alert.initOwner(mainApp.getPrimaryStage());
//				alert.setTitle("No Selection.");
//				alert.setHeaderText("No Person Selected");
//				alert.setContentText("Please select a person in the table.");
//
//				alert.showAndWait();
//			}
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//	}
///**
// * Called when the user click on the edit button. Open a dialog to edit
// * details for the slected person.
// */
//@FXML
//	private void handleEditPerson() {
//	    Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
//	    if (selectedPerson != null) {
//	        boolean okClicked = mainApp.showPersonEditDialog(selectedPerson);
//	        if (okClicked) {
//	            showPersonDetails(selectedPerson);
//	        }
//
//	    } else {
//	        // Nothing selected.
//	        Alert alert = new Alert(AlertType.WARNING);
//	        alert.initOwner(mainApp.getPrimaryStage());
//	        alert.setTitle("No Selection");
//	        alert.setHeaderText("No Person Selected");
//	        alert.setContentText("Please select a person in the table.");
//
//	        alert.showAndWait();
//	    }
//	}
//
//
//
//
///**
// *
// * called when the user click on the new button. open edit dialog to edit.
// *
// *
// */
//@FXML
//private void handleNewPerson(){
//	Person tempPerson = new Person();
//	boolean okClicked = mainApp.showPersonEditDialog(tempPerson);
//	if (okClicked){
//		mainApp.getPersonData().add(tempPerson);
//	}
//}
//
//}
