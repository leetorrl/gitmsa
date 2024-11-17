export default function EventArgs2() {
  const current = e => {
    const type = e.target.dataset.type;
    const d = new Date();
    switch(type) {
      case 'date':
        console.log(`${e.target.id}: ${d.toLocaleDateString()}`);
        break;
      case 'time':
        console.log(`${e.target.id}: ${d.toLocaleTimeString()}`);
        break;
      default:
        console.log(`${e.target.id}: ${d.toLocaleString()}`);
        break;
    }
  };
  return (
    <div>
      {/* 출력할 날짜 및 시각 유형을 고유 데이터 속성으로 지정 */}
      <button id="dt" data-type="datetime" onClick={current}>현재 날짜 및 시각</button>
      <button id="date" data-type="date" onClick={current}>현재 날짜</button>
      <button id="time" data-type="time" onClick={current}>현재 시각</button>
    </div>
  );
}