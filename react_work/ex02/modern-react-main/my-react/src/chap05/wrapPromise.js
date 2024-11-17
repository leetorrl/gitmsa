export default function wrapPromise(promise) {
  // Promise 상태 관리(pending, fullfilled, rejected)
  let status = 'pending';
  // Promise에서 받은 데이터
  let data;
  // 원래의 Promise에 후처리 부여
  let wrapper = promise.then(
    // 성공 시 status를 fulfilled(성공), data에 취득한 데이터를 설정한다.
    result => {
      status = 'fulfilled';
      data = result;
    },
    // 실패 시 status를 rejected(실패), data에 에러 오브젝트를 설정한다.
    e => {
      status = 'rejected';
      data = e;
    }
  );
  // 반환값은 Promise의 상태에 따라 값을 반환하는 get 메서드를 가진 객체다.
  return {
    get() {
      switch(status) {
        case 'fulfilled':
          return data;    // 성공 시 실제 데이터를 반환한다.
        case 'rejected':  
          throw data;     // 실패 시 에러 발생
        case 'pending':   
          throw wrapper;  // 완료하기 전에 Promise를 던져라.
        default:
          break;
      }
    }
  };
}