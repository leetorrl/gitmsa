import { useQuery } from 'react-query';

type WeatherType = {
  weather: Array<{
    id: number
    main: string
    description: string
    icon: string
  }>
}

// 날씨 정보를 얻기 위한 함수
const fetchWeather = async () => {
  const res = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=Seoul&lang=kr&appid=ef23a61e94f59784b8451d12c0d07da8`);
  if (res.ok) {
    return  await res.json() as WeatherType;
  }
  throw new Error(res.statusText);
};

export default function QuerBasic() {
  // fetchWeather 함수로 데이터 가져오기
  const { data, isLoading, isError, error } = useQuery<WeatherType, Error>('weather', fetchWeather);
  if (isLoading) {
    return <p>Loading...</p>
  }
  if (isError) {
    return <p>Error: {error.message}</p>
  }

  return (
    <figure>
      <img
      src={`https://openweathermap.org/img/wn/${data?.weather?.[0]?.icon}.png`}
      alt={data?.weather?.[0]?.main} />
      <figcaption>{data?.weather?.[0]?.description}</figcaption>
    </figure>
  );
}