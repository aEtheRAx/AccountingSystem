package za.ac.nwu.as.web.sb.controller.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.as.domain.service.GeneralResponse;

@RestController
/*@RequestMapping("@demo")*/

public class AccountTypeController {

    @GetMapping("/all")
    public GeneralResponse<String> getAll() {return new GeneralResponse<>(true, "No types found");}
    /*@GetMapping("/ping")
    @ApiOperation(value = "Echo the Ping.", notes = "This echo the ping back to the client")
            @ApiResponses(value = {@ApiResponse(code = 200, message = "The Ping was received and echoed", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response =
            GeneralResponse.class),
    @ApiResponse(code = 404, message = "Not found", response =
            GeneralResponse.class),
    @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
public ResponseEntity<String> ping(@RequestParam(value = "value that will be echoed", defaultValue ="pong")
    String echo) {
        return new ResponseEntity<>(echo, HttpStatus.OK);*/
}
