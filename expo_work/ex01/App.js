import { StatusBar } from 'expo-status-bar';
import { Alert, Pressable, TouchableOpacity } from 'react-native';
import { StyleSheet, Text, View } from 'react-native';
import { Button } from 'react-native-web';

export default function App() {


  const doPerss1 = ()=> {
    Alert.alert('doPress1')
    console.log('doPress1')
  }

  const doPerss2 =()=>{
    Alert.alert('doPress2')
    console.log('doPress2')
  }



  return (
    <View style={styles.container}>
      <Text style={styles.text}>Open up App.js to start working on your app!</Text>
      <TouchableOpacity style={styles.Button} onPress={doPerss1}>
        <Text style={styles.text}>누르는 버튼</Text>
      </TouchableOpacity>
      <Pressable style={styles.Button} onPress={doPerss2}>
      <Text style={styles.text}>누르는 버튼</Text>
      </Pressable>



      
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#999',
    alignItems: 'center',
    justifyContent: 'center',
  },
  text:{
    fontSize: 24,
    color: 'white'
  },
  Button:{
    backgroundColor: 'blue',
    padding: 10,
    borderRadius: 5,
    color: 'white',
    marginTop: 10,
  }
});
