package com.example.idus.members.entrypoints.rest;

import com.example.idus.members.service.MemberService;
import com.example.idus.members.service.dto.MemberDetailResult;
import com.example.idus.shared.dto.QueryParameter;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberRestController {
    private final Logger log = LoggerFactory.getLogger(MemberRestController.class);
    private final MemberService memberService;

    @GetMapping("/members/{id}")
    public ResponseEntity<MemberDetailResult> findMember(@PathVariable Long id) {
        MemberDetailResult result = memberService.findMember(id);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/members")
    public ResponseEntity<List<MemberDetailResult>> queryMembers(
            @RequestParam Integer page,
            @RequestParam Integer size,
            @RequestParam String queryName,
            @RequestParam String queryValue
    ) {

        List<MemberDetailResult> members = memberService.findMembers(new QueryParameter(queryName, queryValue));
        return ResponseEntity.ok(members);
    }
}