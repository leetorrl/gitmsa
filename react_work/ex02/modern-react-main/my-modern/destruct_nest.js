const member = {
  fullname: '사토 리오',
  address: {
    prefecture: '스즈오카현',
    city: '후지에다시'
  }
};
const { address, address: { city } } = member;
console.log(address); // 결과: { prefecture: '스즈오카현', city: '후지에다시' }
console.log(city);    // 결과: 후지에다시
