import { useQuery } from 'react-query';

// delay 초 동안 처리를 일시 정지하는 sleep 함수
const sleep = delay => new Promise(resolve => setTimeout(resolve, delay));

// 날씨 정보를 얻기 위한 함수
const fetchWeather = async () => {
  // 처리 지연을 위한 더미 휴지 처리
  await sleep(2000);
  const res = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=Seoul&lang=ko&appid=xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx`);
  if (res.ok) { return res.json(); }
  throw new Error(res.statusText);
};

export default function QuerBasic() {
  // fetchWeather 함수로 데이터 가져오기
  const { data, isLoading, isError, error } = useQuery('weather', fetchWeather);
  // 로딩 중일 경우 로딩 메시지 표시
  if (isLoading) {
    return <p>Loading...</p>;
  }
  // 통신 오류 발생 시 오류 메시지 표시
  if (isError) {
    return <p>Error: {error.message}</p>;
  }
  // 로딩 중이거나 오류가 아닌 경우 결과 표시
  return (
    <figure>
      <img
      src={`https://openweathermap.org/img/wn/${data?.weather?.[0]?.icon}.png`}
      alt={data?.weather?.[0]?.main} />
      <figcaption>{data?.weather?.[0]?.description}</figcaption>
    </figure>
  );
}