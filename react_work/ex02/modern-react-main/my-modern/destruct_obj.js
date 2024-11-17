const member = {
  fullname: '사토 리오',
  sex: '여성',
  age: 18
};
const { fullname, sex, memo = '---' } = member;
console.log(sex, fullname, memo);   // 결과: 여성 사토 리오 ---

// const { sex: gender } = member;
// console.log(gender); // 결과: 여성

// const { fullname, ...rest } = member;
// console.log(fullname); // 결과: 사토 리오
// console.log(rest); // 결과: { sex: '여성', age: 18 }

// let fullname, sex, memo;
// ({ fullname, sex, memo = '---' } = member);
// console.log(sex, fullname, memo);   // 결과: 여성 사토 리오 ---

