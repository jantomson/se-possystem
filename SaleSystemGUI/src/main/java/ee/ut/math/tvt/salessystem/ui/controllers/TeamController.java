package ee.ut.math.tvt.salessystem.ui.controllers;

import ee.ut.math.tvt.salessystem.dao.SalesSystemDAO;
import ee.ut.math.tvt.salessystem.dataobjects.TeamInfo;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;


public class TeamController implements Initializable {

    @FXML
    private Text name;

    @FXML
    private Text leader;

    @FXML
    private Text email;

    @FXML
    private Text members;

    private TeamInfo teamInfo;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadTeamInfo();
    }

    public TeamController(TeamInfo teamInfo) {
        teamInfo = new TeamInfo();

    }

    private void loadTeamInfo() {
        name.setText(teamInfo.getTeamName());
        leader.setText(teamInfo.getTeamContact());
        email.setText(teamInfo.getTeamContact());
        members.setText(teamInfo.getTeamMembers());
    }


}
