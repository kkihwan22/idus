package com.example.idus.members.service;

import com.example.idus.members.service.dto.MemberDetailResult;
import com.example.idus.shared.dto.QueryParameter;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {
    private final Logger log = LoggerFactory.getLogger(MemberServiceImpl.class);

    @Override
    public Long createMember() {
        return null;
    }

    @Override
    public MemberDetailResult findMember(Long memberId) {
        return null;
    }

    @Override
    public List<MemberDetailResult> findMembers(QueryParameter query) {
        return null;
    }
}