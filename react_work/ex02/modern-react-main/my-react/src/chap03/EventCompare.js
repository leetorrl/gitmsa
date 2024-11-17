import { useState } from 'react';
import './EventCompare.css';

export default function EventCompare() {
  const [result, setResult] = useState('');
  // mouseenter/mouseleave 이벤트의 정보를 result에 반영
  const handleIn = e => setResult(r => `${r}Enter:${e.target.id}<br />`);
  const handleOut= e => setResult(r => `${r}Leave:${e.target.id}<br />`);
  return (
    <>
      <div id="outer"
        onMouseEnter={handleIn} onMouseLeave={handleOut}
        // onMouseOver={handleIn} onMouseOut={handleOut}
        >
        외부（outer）
        <p id="inner">
        내부（inner）
        </p>
      </div>
      <div dangerouslySetInnerHTML={{__html: result}}></div>
    </>
  );
}