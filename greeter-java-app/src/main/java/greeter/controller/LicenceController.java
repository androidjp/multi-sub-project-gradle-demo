package greeter.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("licences")
public class LicenceController {
    @Resource
    private LicenceService licenceService;

    @GetMapping
    public String get() {
        return "hello";
    }

    @PostMapping
    public String create(@RequestBody(required = false) String licence) {
        return licenceService.createLicence(licence);
    }

}
