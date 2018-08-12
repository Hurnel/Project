public class TV
{
        private boolean state = false;
        private String currentChannel = "1";
        private String channels[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        private int volume = 1;

        public boolean isState()
        {
            return state;
        }

        public void setState (boolean state)
        {
            this.state = state;
            if (state)
                System.out.println("TV jest włączony");
        }

        public void setChannel(String s)
        {
            currentChannel = s;
            System.out.println("Aktualny kanał to: " + s);
        }

        public void changeChannel (boolean b)
        {
            int nextChannel = 0;
            for(int i=0; i<channels.length; i++)
            {
                if(currentChannel.equals(channels[i])) {
                    nextChannel = i;
                }
            }
            if(b&&nextChannel==9)
                currentChannel = "1";
            else if(!b&&nextChannel==1)
                currentChannel = "9";
            else if(b)
                currentChannel = channels[++nextChannel];
            else
                currentChannel = channels[--nextChannel];
            System.out.println("Aktualny kanal to: " + currentChannel);
        }

        public void changeVolume (boolean b)
        {
            if (b)
            {
                if (volume < 15)
                    volume++;
                else {}
            }
            else
            {
                if (volume < 15)
                    volume--;
                else {}
            }
            System.out.println("Aktualna głośność to: " + volume);
        }
}