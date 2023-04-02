package com.example.lostark_tool.sample_post;


import com.example.lostark_tool.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/post-api")
public class postRequest {

    @RequestMapping(value = "/domain", method = RequestMethod.POST)
    public String postTest() {
        return "Hello Post Api";
    }

    @PostMapping(value = "/post1")
    public String postMember(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }
}
