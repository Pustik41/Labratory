package controller;

import exceptions.MedPersonalNotFoundException;
import exceptions.RegisterException;
import model.MedPersonal;
import model.Position;
import model.Report;

import java.time.LocalDate;

/**
 * Created by gorobec on 17.07.16.
 */
public interface HeadController extends DoctorController {

    boolean register(String name, String surname, LocalDate dateOfBirth, String phoneNumber,
                     String email,  String login, String pass, Position position) throws RegisterException;

    boolean dismissMedPersonal(String name, String surname, LocalDate dateOfBirth) throws MedPersonalNotFoundException;

    boolean changeRaportStatusWhenDane(Report report);
}
