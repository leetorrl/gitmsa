import { createRouter, createWebHistory } from 'vue-router'

import Calendar from '@/components/Calendar.vue'

import BoardView from '@/components/BoardView.vue'
import BoardInput from '@/components/BoardInput.vue'

import Mypage from '@/components/Mypage.vue'
import Quirylist from '@/components/Quirylist.vue'

import requestlist from '@/components/requestlist.vue'
import freeBoardinput from '@/components/freeBoardinput.vue'
import Linkloding from '@/components/Linkloding.vue'
import Vacationinput from '@/components/Vacationinput.vue'
import Vacationmemory from '@/components/Vacationmemory.vue'
import Hwpdownload from '@/components/Hwpdownload.vue'
import DayzCounter from '@/components/DayzCounter.vue'
import attendancelist from '@/components/attendancelist.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/Calendar',
      name: 'calender',
      component: Calendar
    },
    {
      path: '/BoardView/:pageidx',
      name: 'boardview',
      component: BoardView
    },
    {
      path: '/BoardInput',
      name: 'boardinput',
      component: BoardInput
    },
    {
      path: '/Mypage',
      name: 'mypage',
      component: Mypage
    },
    {
      path: '/Quirylist',
      name: 'quirylist',
      component: Quirylist
    },

    {
      path: '/requestlist',
      name: 'requestlist',
      component: requestlist
    },
    {
      path: '/freeBoardinput',
      name: 'freeboardinput',
      component: freeBoardinput
    },
    {
      path: '/Linkloding/:idx',
      name: 'linkloding',
      component: Linkloding
    },
    {
      path: '/Vacationinput',
      name: 'vacationinput',
      component: Vacationinput
    },
    {
      path: '/Vacationmemory',
      name: 'vacationmemory',
      component: Vacationmemory
    },
    {
      path: '/Hwpdownload',
      name: 'hwpdownload',
      component: Hwpdownload
    },
    {
      path: '/DayzCounter',
      name: 'dayzcounter',
      component: DayzCounter
    },
    {
      path: '/attendancelist',
      name: 'attendancelist',
      component: attendancelist
    }
  ]
})

export default router
