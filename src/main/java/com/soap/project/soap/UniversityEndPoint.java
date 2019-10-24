package com.soap.project.soap;

import localhost._7000.university.GetUniversityRequest;
import localhost._7000.university.GetUniversityResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UniversityEndPoint {
    private static final String NAMESPACE_URI = "http://localhost:7000/university";

    private UniversityRepository universityRepository;

    @Autowired
    public UniversityEndPoint(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getUniversityRequest")
    @ResponsePayload
    public GetUniversityResponse getUniversityResponse(@RequestPayload GetUniversityRequest getUniversityRequest) {
        GetUniversityResponse response = new GetUniversityResponse();
        response.setUniversity(universityRepository.getUniversityByName(getUniversityRequest.getName()));
        return response;
    }


}