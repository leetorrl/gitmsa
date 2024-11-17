let i = 0;
const member = {
  [`attr${++i}`]: '사토 리오',
  [`attr${++i}`]: '여성',
  [`attr${++i}`]: '18세'
};
console.log(member);
            // 결과: { attr1: '사토 리오', attr2: '여성', attr3: '18세' }