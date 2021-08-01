package com.springjpa.snowflake.spk.service.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springjpa.snowflake.spk.service.entity.Student;

@Api(value = "student", description = "the Student API")
public interface StudentApi {

    @ApiOperation(value = "", response = Student.class, tags = {"Student",})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "A successful student record", response = Student.class)})
    @RequestMapping(value = "/student",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<Student> getStudentById(
            @RequestParam("studentId")
                    Long studentId);

}
