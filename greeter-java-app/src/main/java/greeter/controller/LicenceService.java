package greeter.controller;

import org.springframework.stereotype.Service;

@Service
public class LicenceService {
    public String createLicence(String licence) {
        MyResponseEnum.LICENCE_NOT_FOUND.assertNotNull(licence);
        return "success";
    }
}
