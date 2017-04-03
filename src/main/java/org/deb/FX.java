/**
 * Copyright 2015-2016 Debmalya Jash
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.deb;

import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Glow;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.Date;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author debmalyajash
 *
 */
public class FX extends Application {

	private static String[] arguments;

	public static void main(String[] args) {
		arguments = args;
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		if (arguments != null && arguments.length > 1) {
			primaryStage.setTitle(arguments[0]);
		} else {
			primaryStage.setTitle("Hello Java FX!");
		}
		Button btn = new Button();
		btn.setText("Say 'Time Now'");
		Label timeLable = new Label("");
		btn.setOnAction(new EventHandler<ActionEvent>() {

			
			@Override
			public void handle(ActionEvent event) {
				timeLable.setText(new Date().toString());
			}
		});

		
		final String[] viewOptions = new String[] { "Title", "Binomial name", "Picture", "Description" };

		MenuBar menuBar = new MenuBar();
		// --- Menu File
		Menu menuFile = new Menu("File");
		// --- Menu Edit
		Menu menuEdit = new Menu("Edit");
		// --- Menu View
		Menu menuView = new Menu("View");
		menuBar.getMenus().addAll(menuFile, menuEdit, menuView);
		
		
		
		Scene scene = new Scene(new VBox(), 400, 350); scene.setFill(Color.OLDLACE);
//		root.getChildren().addAll(menuBar);
		((VBox) scene.getRoot()).getChildren().addAll(menuBar);
		
		
		((VBox) scene.getRoot()).getChildren().add(btn);
		((VBox) scene.getRoot()).getChildren().add(timeLable);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
