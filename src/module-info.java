module workshop.javafx.jdbc {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.sql;
	
	opens gui to javafx.fxml;
	opens application to javafx.graphics, javafx.fxml;
}
