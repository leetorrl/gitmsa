package com.pmh.ex07.user;

import com.pmh.ex07.error.BizException;
import com.pmh.ex07.error.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor //생성자 자동 완성 시키는 명령문
public class UserService {


    private final UserRepository userRepository;

    //email 중복이면 에러코드뜨게
    //중복 아니면 인설트 정상적으로 되게
    public void insert(UserReqDto userReqDto){

        Optional<User> optionalUser = userRepository.findByEmail(userReqDto.getEmail());
        optionalUser.ifPresent(user -> {
            throw new BizException(ErrorCode.DUPLICATE_USERS);
        });

        System.out.println("실행"+ userReqDto);
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReqDto, User.class);
        System.out.println("user = "+ user);
        userRepository.save(user);

    }
}