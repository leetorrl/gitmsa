import { useState } from 'react';
import { createPortal } from 'react-dom';
import './PortalBasic.css';

export default function PortalBasic() {
  // 다이얼로그 창의 개폐 상태를 나타내는 State(false로 닫힌 상태)
  const [show, setShow] = useState(false);
  // 버튼 클릭 시 핸들러(State 켜기/끄기)
  const handleDialog = () => setShow(s => !s);

  return (
    <form>
      <button type="button" onClick={handleDialog}
        disabled={show}>
        다이얼로그 표시
      </button>
      {show && createPortal(
        <div className="dialog">
          <p>Portal에서 생성된 대화상자</p>
          <button type="button" onClick={handleDialog}>
            닫기
          </button>
        </div>,
        document.getElementById('dialog')
      )}
    </form>
  );
}
