package com.android.tithiinterview.api;

public class HttpParams {
    public static final String BASE_URL = "http://51.68.33.87/smartsales/es_transcom_web_services_final_02_10_17/TEST_TBL/mobile_api/api/";
    public static final String LOGIN_ENDPOINT = "Login/truckLogin";
    public static final String ADD_TRUCK_ENDPOINT = "Truck_data/truckDataInsert";
    public static final String GET_TRUCK_ENDPOINT = "Truck_data/getAllTruckByTransportCoId";
    public static final String SUBMIT_REQ_ENDPOINT = "TruckRequestApprovals/truckRequestApprovalInsert\n";
    public static final String HISTORY_ENDPOINT = "TruckRequestApprovals/getAllTruckRequestApprovalInfo\n";
    public static final String AVAILABILITY_ENDPOINT = "TruckRequestApprovals/truckAvailability\n";
    public static final String REQUEST_FORWARD = "TruckRequestApprovals/truckRequestForward\n";
    public static final String REQUEST_ACCEPT = "TruckRequestApprovals/truckRequestAccept\n";
    public static final String TODAY_ACCEPT_HISTORY = "TruckRequestApprovals/acceptHistoryToday\n";
    public static final String ACCEPT_HISTORY = "TruckRequestApprovals/acceptHistory\n";
    public static final String REQUEST_SEND_FIREBASE_ID = "TruckRequestApprovals/sendFirebaseIdToServer";
}
