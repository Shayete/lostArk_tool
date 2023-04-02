package com.example.lostark_tool.sample_get;

import com.example.lostark_tool.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/variableTest")
public class getRequestValue {
    @GetMapping(value = "/variable/{variable}")
    public String CopyString(@PathVariable String variable) {
        return variable;
    }

    @GetMapping("/variable2")
    public String CopyStrings(@RequestParam String name,
                              @RequestParam String name2,
                              @RequestParam String name3) {
        return name + " " + name2 + " " + name3;
    }

    @GetMapping("/variable3")
    public String getMemberDto(MemberDto memberDto) {
        return memberDto.toString();
    }
}
