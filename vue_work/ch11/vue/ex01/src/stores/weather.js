import { defineStore } from "pinia";
import axios from "axios";
import { ref } from "vue";
import dayjs from 'dayjs'
import {computed} from 'vue'

const axiosInstance = axios.create({
    baseURL:'https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline',
    params: {
        lang: 'ko',
        key: 'FFPMWLYPKNFHUWAT4LNK7B2X4',
        unitGroup: 'metric',
    }
})

// ipify API를 기본값으로 하는 axios 인스턴스 생성
const axiosInstance2 = axios.create({
    baseURL:'https://api64.ipify.org/?format=json',
})

const axiosInstance3 = axios.create({
    baseURL: 'https://freeipapi.com/api/json',
})

export const useWeatherStore = defineStore('weather', ()=> {
    const address = ref('seoul');
    const currentConditions = ref(null)//날씨 정보 데이터 초기 null값
    const days = ref(null) //일자별 날씨 객체가 담긴 배열
    const searchData = ref([]) //검색날씨 데이터


    const getSearchWeatherInfo = async(city) => {

        try{

            const res = await axiosInstance.get('/'+city)

            const printData = {
                address: res.data.address,
                feelslikemax: res.data.days[0].feelslikemax,
                feelslikemin: res.data.days[0].feelslikemin,
                icon:res.data.currentConditions.icon,
                temp:res.data.currentConditions.temp,
            }
            if(
                searchData.value.findIndex((v)=> v.address === res.data.address)=== -1
            ){
                searchData.value.push(printData)
            }else{
                alert('이미 조회한 지역입니다.')
            }

        }catch(e){

            alert(e.response?.data ? e.response?.data : e.message)
        }
    }


    const hours = computed(() => {

        return days.value

        //날씨 객체 배열에서 오늘 날짜와 일치하는 객체 1개를 찾음
        ?.find((v)=> v.datetime === dayjs().format('YYYY-MM-DD'))

        //현재 시각 이후 시간만 시간별 데이터에 포함
        ?.hours.filter((v)=> v.datetime > dayjs().format('HH:mm:ss'))
    })


    //현재 날씨API 불러오기
    const getCurrentWeatherInfo = async () => {
        
        try{

            const res = await axiosInstance.get('/'+address.value)
            currentConditions.value = res.data.currentConditions;
            days.value = res.data.days
            console.log(days.value)

        }catch(e){
            alert(e.response?.data ? e.response?.data : e.message)
        }
    }

    const forecast = computed(() => {
        return days.value?.filter((v)=> v.datetime > dayjs().format('YYYY-MM-DD'))
    })


    const getCityName = async () => {
        try{

            const res = await axiosInstance2.get();
            const ip = res.data.ip;
            console.log(ip);
            const res2 = await axiosInstance3.get('/'+ip);
            address.value = res2.data.CityName
        }catch(e){

            alert(e.response?.data ? e.response?.data : e.message)
        }
    }



    return{currentConditions, getCurrentWeatherInfo,hours,forecast,searchData,getSearchWeatherInfo,getCityName,address,}
})