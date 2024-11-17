import { useQuery } from 'react-query';

// delay 밀리초 동안 처리를 일시 정지하는 sleep 함수
const sleep = delay => new Promise(resolve => setTimeout(resolve, delay));

const fetchWeather = async () => {
  // 더미 지연
  await sleep(2000);
  // const res = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=Tokyo&lang=ja&appid=xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx`);
  const res = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=Seoul&lang=kr&appid=6fd0c26b5a2a9ad110324cc29669eb7c`);
  if (res.ok) { return res.json(); }
  throw new Error(res.statusText);
};

export default function QuerySuspense() {
  const { data } = useQuery('weather', fetchWeather);
  // const { data } = useQuery('weather', fetchWeather, { suspense: true });

  return (
    <figure>
      <img
      src={`https://openweathermap.org/img/wn/${data?.weather?.[0]?.icon}.png`}
      alt={data?.weather?.[0]?.main} />
      <figcaption>{data?.weather?.[0]?.description}</figcaption>
    </figure>
  );
}