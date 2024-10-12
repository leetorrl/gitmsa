package com.pmh.org.user;

import com.pmh.org.error.BizException;
import com.pmh.org.error.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor //생성자 자동 완성 시키는 명령문
public class UserServiceimpl implements UserService {


    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    //email 중복이면 에러코드뜨게
    //중복 아니면 인설트 정상적으로 되게
    public void insert(UserReqDto userReqDto){

        Optional<User> optionalUser = userRepository.findByEmail(userReqDto.getEmail());
        optionalUser.ifPresent(user -> { //중복 확인
            throw new BizException(ErrorCode.DUPLICATE_USERS);
        });

        System.out.println("실행"+ userReqDto);
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReqDto, User.class);
        System.out.println("user = "+ user);
        userRepository.save(user);

    }

    @Override
    public void update(UserReqDto userReqDto){

        System.out.println("실행"+ userReqDto);

        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReqDto, User.class);

        System.out.println("user = "+ user);

        User dbUser = userRepository.findById(
                user.getIdx()).orElseThrow(()->{throw new
                BizException(ErrorCode.NOT_FOUND);
        });

        user.setWdate(dbUser.getWdate());




        userRepository.save(user);

    }
}