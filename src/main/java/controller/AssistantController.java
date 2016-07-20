package controller;

import exceptions.NoReportsFoundException;
import exceptions.PatientCreationException;
import exceptions.PatientNotFoundException;
import model.Analysis;
import model.Patient;
import model.Report;
import model.Result;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Created by gorobec on 17.07.16.
 */
public interface AssistantController {


    Map<Report, Map<Analysis, Result>> TakeReportsFromQueue(Queue<String> newReports) throws NoReportsFoundException; // take a report from the general queue and add your

    boolean workWithReport(Report report); //take from the map reports and an assistant working with him

    Map<Report, Map<Analysis, Result>> allRaportsInProgress(); // show our map reports

    Map<Report, Map<Analysis, Result>> allDoneReports();

    List<Report> searchReportByStratDate (LocalDate dateStart) throws NoReportsFoundException;

}
