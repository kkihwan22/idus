package com.example.idus.members.service;

import com.example.idus.members.service.dto.MemberDetailResult;
import com.example.idus.shared.dto.QueryParameter;

import java.util.List;

public interface MemberService {

    Long createMember();
    MemberDetailResult findMember(Long memberId);
    List<MemberDetailResult> findMembers(QueryParameter query); // TODO: pagination 기능 구혀
}
